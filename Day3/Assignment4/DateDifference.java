package Day3.Assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDifference {
    public static void main(String[] args) throws ParseException {
        String Inputdate1 = args[0];
        String Inputdate2 = args[1];

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

        Date date1 = dateFormat.parse(Inputdate1);
        Date date2 = dateFormat.parse(Inputdate2);

        long difference = Math.abs(date1.getTime()-date2.getTime());

        System.out.println("Date 1 is : " + Inputdate1);
        System.out.println("Date 2 is : " + Inputdate2);
        System.out.println("Difference is : " + difference/1000/3600/24 + " days");

    }
}
