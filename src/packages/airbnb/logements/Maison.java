package packages.airbnb.logements;

import packages.airbnb.utilisateurs.Hote;

public class Maison extends Logement {

    private int superficieJardin;
    private boolean possedeJardin;
    public Maison(Hote lhote, int lTarifParNuit, String lAdresse, int lSuperficie, int lNbVoyageurMax, int lSuperficieJardin, boolean lPossedeJardin) {
        super(lhote, lTarifParNuit, lAdresse, lSuperficie, lNbVoyageurMax);

        superficieJardin = lSuperficieJardin;
        possedeJardin = lPossedeJardin;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Ce logement est une maison situé " + getAdresse() +
                (possedeJardin ? " piscine " + superficieJardin :
                        " ,pas de jardin");
    }
}
