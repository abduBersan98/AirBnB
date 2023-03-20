package packages.airbnb.logements;

import packages.airbnb.utilisateurs.Hote;


public class Chalet extends Logement{
    private int hauteurDeNeige;
    private int altitude;

    public Chalet(Hote lhote, int lTarifParNuit, String lAdresse, int lSuperficie, int lNbVoyageurMax, int lHauteurDeNeige, int lAltitude) {
        super(lhote, lTarifParNuit, lAdresse, lSuperficie, lNbVoyageurMax);
        hauteurDeNeige = lHauteurDeNeige;
        altitude = lAltitude;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Hote : " + getHote() + "\n Ce logement est un chalet" +
                "\n Adresse :" + getAdresse() + "\n Neige : " + hauteurDeNeige + " cm" ;
    }

}
