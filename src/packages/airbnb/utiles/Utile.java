package packages.airbnb.utiles;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utile {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    private Utile(){

    }

    public static String dateToString(Date date){
        return date.getDate() + "/";
    }

    public static String dateToString2(Date date){
        return SIMPLE_DATE_FORMAT.format(date);
    }
}
