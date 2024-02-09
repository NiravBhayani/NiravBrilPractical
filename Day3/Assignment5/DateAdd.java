package Day3.Assignment5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAdd {
    public static void main(String[] args) throws IllegalAccessException, ParseException {
        if(args.length<3){
            throw new IllegalAccessException("Invalid Argument.Valid only: InputDate AddType number");
        }
        String inputDate = args[0];
        String addType = args[1];
        int number = Integer.parseInt(args[2]);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parsedDate = dateFormat.parse(inputDate);

        Date result = addInDate( parsedDate,addType,number);
        System.out.println("Result of Date is : " + dateFormat.format(result));
    }
    private static Date addInDate(Date inputDate,String addType,int number) throws IllegalAccessException {
        Calendar c1= Calendar.getInstance();
        c1.setTime(inputDate);

        switch (addType.toLowerCase()){
            case "year":
                c1.add(Calendar.YEAR,number);
                break;
            case "month":
                c1.add(Calendar.MONTH,number);
                break;
            case "day":
                c1.add(Calendar.DATE,number);
                break;
            default:
                throw new IllegalAccessException("Invalid add type.Use only year, month or day");
        }
        return c1.getTime();
    }
}
