package packages.airbnb.logements;

import packages.airbnb.utilisateurs.Hote;

public class Appartement extends Logement{

    private int numeroEtage;

    private int superficieBalcon;
    public Appartement(Hote lhote, int lTarifParNuit, String lAdresse, int lSuperficie, int lNbVoyageurMax,int lnumeroEtage, int lsuperficieBalcon) {
        super(lhote, lTarifParNuit, lAdresse, lSuperficie, lNbVoyageurMax);

        numeroEtage = lnumeroEtage;
        superficieBalcon = lsuperficieBalcon;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Ce logement est un appartement " +
                "\n Adresse : " + getAdresse() + "\n Etage : " + numeroEtage ;
    }
}
