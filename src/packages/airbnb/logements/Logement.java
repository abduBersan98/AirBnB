package packages.airbnb.logements;

import packages.airbnb.utilisateurs.Hote;
import packages.airbnb.utilisateurs.Personne;
import packages.airbnb.utilisateurs.Voyageur;

public class Logement {
    private Hote hote;
    private int tarifParNuit;
    protected String adresse;
    private int superficie;
    private int nbVoyageurMax;


    public Logement (Hote lhote, int lTarifParNuit, String lAdresse, int lSuperficie, int  lNbVoyageurMax){
        this.hote = lhote;
        this.tarifParNuit = lTarifParNuit;
        this.adresse = lAdresse;
        this.superficie = lSuperficie;
        this.nbVoyageurMax = lNbVoyageurMax;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    public Hote getHote() {
        return hote;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbVoyageurMax() {
        return nbVoyageurMax;
    }

    public String toString(){
        return this.hote.toString();
    }

    public void afficher(){
        System.out.println(toString());
    }

}
