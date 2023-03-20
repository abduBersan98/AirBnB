package packages.airbnb.utiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {


    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * @param jour entre 1 et 31
     * @param mois entre 1 et 12
     * @param annee 2023 dans l'idée
     */


    public MaDate(int jour, int mois, int annee) {
        super(annee -1900, mois -1, jour);
    }

    @Override
    public String toString() {
        return SIMPLE_DATE_FORMAT.format(this);
    }
}
