package packages.airbnb.reservations;

import packages.airbnb.logements.Logement;
import packages.airbnb.utiles.MaDate;

import java.util.Date;

public abstract class Sejour implements SejourInterface{
    Logement logement;
    private Date dateArrivee;
    private int nbNuit;
    private int nbVoyageur;
    protected int tarif;

    public Sejour(Logement sLogement, Date sDateArrivee, int sNbNuit, int sNbVoyageur){
        this.logement = sLogement;
        this.dateArrivee = sDateArrivee;
        this.nbNuit = sNbNuit;
        this.nbVoyageur = sNbVoyageur;

        this.miseAJourTarif();
    }

    public abstract void miseAJourTarif();

    public int getNbNuit() {
        return nbNuit;
    }

    public int calculTarif(){
        return logement.getTarifParNuit() * nbNuit;
    }
    public String toString(){
        return this.logement.toString();
    }
    public void afficher(){
        System.out.println(toString());
    }

     @Override
     public boolean verificationDateArrivee(){
        if(dateArrivee.getTime() > System.currentTimeMillis()){
            return true;
        }else{
            return false;
        }
     }

    @Override
    public boolean verificationNombreDeNuits() {
        if(nbNuit>= 1 && nbNuit <= 31){
            return true;
        }
        return false;
    }

    @Override
    public boolean verificationNombreDeVoyageurs() {
        return nbVoyageur >= 1 && nbVoyageur <= logement.getNbVoyageurMax();
    }

    @Override
    public void affcher() {

    }

}
