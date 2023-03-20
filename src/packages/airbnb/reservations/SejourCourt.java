package packages.airbnb.reservations;

import packages.airbnb.logements.Logement;

import java.util.Date;

public class SejourCourt extends Sejour implements ConditionsTarifaireInterface{

    public SejourCourt(Logement sLogement, Date sDateArrivee, int sNbNuit, int sNbVoyageur) {
        super(sLogement, sDateArrivee, sNbNuit, sNbVoyageur);
    }

    @Override
    public void miseAJourTarif() {
        this.tarif = logement.getTarifParNuit() * getNbNuit() ;
    }

    @Override
    public boolean beneficiePromotion() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Le prix de ce séjour court est de: " + this.tarif;
    }

    @Override
    public int getTarif() {
        return tarif;
    }
}
