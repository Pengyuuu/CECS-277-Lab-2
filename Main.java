import java.lang.Object;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main (String[] args){

        GregorianCalendar calendar = new GregorianCalendar(2019, 0, 7, 7, 7, 17);

        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
    }
}
