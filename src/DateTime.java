import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class DateTime {

    public static void main(String[] args) {
        //date_time();
        //newDate();
        //months();
        //weeks();
        //addTimes();
        //countryFormat();
        currentWeekMonth();
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

        System.out.println("Time : " + fmt);

        System.out.println("Tie : " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));

        Formatter fm = new Formatter();
        fm.format("%tc", cal);

        System.out.println("with date and time : " + fm);
    }

    public static void months() {

        String[] months = new DateFormatSymbols().getMonths();
        String[] shortMonths = new DateFormatSymbols().getShortMonths();

        for (int i = 0; i < months.length - 1; i++) {

            String month = months[i];
            String shortMonth = shortMonths[i];

            System.out.println("Months = " + month);
            System.out.println("shortMonth = " + shortMonth + "\n");

        }
    }

    public static void weeks() {
        String[] weeks = new DateFormatSymbols().getWeekdays();
        String[] shortWeeks = new DateFormatSymbols().getShortWeekdays();

        for (int i = 1; i < weeks.length - 1; i++) {

            String week = weeks[i];
            String shortWeek = shortWeeks[i];

            System.out.println("Weeks : " + week);
            System.out.println("shortWeeks : " + shortWeek + "\n");
        }

    }

    public static void addTimes() {
        Date d1 = new Date();

        Calendar cl = Calendar.getInstance();

        cl.setTime(d1);
        System.out.println("today is " + d1.toString());

        cl.add(Calendar.MONTH, 1);
        System.out.println("date after a month will be " + cl.getTime().toString());

        cl.add(Calendar.DAY_OF_WEEK, 7);
        System.out.println("date after 7 days will be " + cl.getTime().toString());

        cl.roll(Calendar.YEAR, 3);
        System.out.println("date after 3 years will be " + cl.getTime().toString());  // we can use add method and roll method
    }

    public static void countryFormat() {

        Date d1 = new Date();

        System.out.println("today is " + d1.toString());

        Locale locItalian = new Locale("it", "ch");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItalian);

        System.out.println("Italian Language  in Switzerland Format : " + df.format(d1));

    }

    public static void currentWeekMonth() {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current week of month is : " +cal.get(Calendar.WEEK_OF_MONTH)); //get current week
        System.out.println("Current week of year is : " +cal.get(Calendar.WEEK_OF_YEAR)); //get current month
        cal.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println("date after one year : " + (cal.get(Calendar.MONTH) + 1)+ "-"+ cal.get(Calendar.DATE)+ "-"+ cal.get(Calendar.YEAR));

    }

}

