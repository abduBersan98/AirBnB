package packages.airbnb.menu;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import packages.airbnb.utilisateurs.Hote;

public class GestionHotes {



    static void listerHotes() {

        System.out.println("-------------------------------------");
        System.out.println("Liste des hôtes ");

        //Afficher la liste des hôtes
        for (int i = 0; i < Menu.listHotes.size(); i++){
            System.out.println(i + " " + Menu.listHotes.get(i).toString());
        }

        System.out.println("-------------------------------------");

        System.out.println("Saisir une option : ");
        System.out.println("1 : Ajouter un hôte");
        System.out.println("2 : Supprimer un hôte");
        System.out.println("3 : Retour");

        switch (Menu.choix(3)) {
            case 1:
                try{
                    ajouterHote();
                } catch (Exception e) {
                    System.out.println("Une erreur est survenue.");
                    Menu.scanner.next();
                    listerHotes();
                }
                break;
            case 2:
                try {
                    supprimerHote();
                } catch ( InputMismatchException e){
                    System.out.println("Une erreur est survenue");
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Une erreur est survenue lors de la suppréssion (erreur index...).");
                } finally {
                    listerHotes();
                }
                break;
            case 3:
                Menu.listerMenu();
                break;
        }
    }

    private static void ajouterHote() throws Exception {

        System.out.println("-------------------------------------");
        System.out.println("Nom");
        String nom = Menu.scanner.next();

        System.out.println("Prenom");
        String prenom = Menu.scanner.next();

        System.out.println("Age");
        int age = Menu.scanner.nextInt();

        System.out.println("Délai");
        int delai =  Menu.scanner.nextInt();

        System.out.println(nom + " " + prenom + " " + age + " ans " + delai + " heures");

        Menu.listHotes.add(new Hote(nom, prenom, age, delai));

        System.out.println("Un nouveau tableau a été ajouté");

        listerHotes();
    }

    /**
     *
     * @throws InputMismatchException
     * @throws IndexOutOfBoundsException
     */
    private static void supprimerHote() throws InputMismatchException, IndexOutOfBoundsException {

        System.out.println("-------------------------------------");
        System.out.println("Choisir un hote");

        for (int i = 0; i < Menu.listHotes.size(); i++){
            System.out.println(i + " " + Menu.listHotes.get(i).toString());
        }

        int index = Menu.scanner.nextInt();

        Menu.listHotes.remove(index);

        //System.out.println(Menu.listHotes.size());

        listerHotes();
    }

}
