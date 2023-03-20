package packages.airbnb;

import packages.airbnb.logements.Appartement;
import packages.airbnb.logements.Chalet;
import packages.airbnb.logements.Logement;
import packages.airbnb.logements.Maison;
import packages.airbnb.reservations.Reservation;
import packages.airbnb.reservations.Sejour;
import packages.airbnb.reservations.SejourCourt;
import packages.airbnb.reservations.SejourLong;
import packages.airbnb.utiles.MaDate;
import packages.airbnb.utilisateurs.Hote;
import packages.airbnb.utilisateurs.Voyageur;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Voyageur client1 = new Voyageur("Maxime", "Albert", 28);
        Hote hote1 = new Hote("Bardu","Peter", 43, 12);

        Logement logement = new Logement(hote1,1000,"81 Rue Colbert, 37000 Tours" , 140, 5);
        Appartement logement2 = new Appartement(hote1,1000,"81 Rue Colbert, 37000 Tours" , 140, 5, 4, 130);
        Maison logement3 = new Maison(hote1, 500,"12 Place chapelle, 37000 Tours" , 140, 5, 10,false);
        Chalet logement4 = new Chalet(hote1, 300, "12 rue de grozny, 98000",20,3,60, 20);
        Date date = new MaDate(12, 2, 2022);

        int nbNuits = 7;
        Sejour sejour;
        if(nbNuits <= 5){
            sejour = new SejourCourt(logement2,date,5,6);
        }else {
            sejour = new SejourLong(logement3, date,9,7);
        }

        Reservation reservation1 = new Reservation(sejour,client1);
        //logement4.afficher();

        reservation1.afficher();
        //logement3.afficher();
        //sejour.afficher();

    }
}
