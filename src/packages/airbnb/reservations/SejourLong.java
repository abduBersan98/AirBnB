package packages.airbnb.reservations;

import packages.airbnb.logements.Logement;

import java.util.Date;

public class SejourLong extends Sejour implements ConditionsTarifaireInterface{

    private final int PROMOTION_EN_POURCENTAGE = 20;
    private int promotion;


    public SejourLong(Logement sLogement, Date sDateArrivee, int sNbNuit, int sNbVoyageur) {
        super(sLogement, sDateArrivee, sNbNuit, sNbVoyageur);
    }

    @Override
    public void miseAJourTarif() {
        int tarifInitial = logement.getTarifParNuit() * getNbNuit();
        promotion = tarifInitial * PROMOTION_EN_POURCENTAGE / 100;
        tarif = tarifInitial - promotion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Le prix de ce séjour long est de: " + this.tarif + "€" + ("\n La promotion : " + this.promotion);
    }

    @Override
    public boolean beneficiePromotion() {
        return true;
    }

    @Override
    public int getTarif() {
        return tarif;
    }
}
