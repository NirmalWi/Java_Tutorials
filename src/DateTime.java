import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateTime {

    public static void main(String[] args) {
        //date_time();
       //newDate();
        //months();
        weeks();
    }

    public static void date_time() {

        Date date = new Date();

        System.out.println(date);

        String currentDate = "YYYY/MM/DD";

        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss a");
        SimpleDateFormat sdfDate = new SimpleDateFormat(currentDate);

        System.out.println(sdfTime.format(date));
        System.out.println(sdfDate.format(date));

        System.out.println(new SimpleDateFormat("HH:mm:ss a").format(new Date()));

        System.out.println(new SimpleDateFormat("h").format(new Date()));
    }

    public static void newDate() {
        Formatter fmt = new Formatter();

        Calendar cal = Calendar.getInstance();

        fmt.format("%tl:%tM", cal, cal); //l for Hour for the 12-hour clock   |   M for Minute within the hour formatted as two digits

        System.out.println("Time : "+fmt);

        System.out.println("Tie : "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));

        Formatter fm = new Formatter();
        fm.format("%tc",cal);

        System.out.println("with date and time : "+fm);
    }

    public static void months() {

        String[] months = new DateFormatSymbols().getMonths();
        String[] shortMonths = new DateFormatSymbols().getShortMonths();

        for (int i = 0; i < months.length-1; i++) {

            String month = months[i];
            String shortMonth = shortMonths[i];

            System.out.println("Months = "+month);
            System.out.println("shortMonth = " + shortMonth+"\n");

        }
    }

    public static void weeks(){
        String[] weeks = new DateFormatSymbols().getWeekdays();
        String[]shortWeeks = new DateFormatSymbols().getShortWeekdays();

        for (int i = 0; i < weeks.length-1; i++) {

            String week = weeks[i];
            String shortWeek = shortWeeks[i];

            System.out.println("Weeks : "+week);
            System.out.println("shortWeeks : "+shortWeek+"\n");
        }

    }
}

