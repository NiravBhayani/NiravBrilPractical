package Day3.Assignment3;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {
    public static void main(String[] args) throws ParseException, IllegalAccessException {
        String outputFormatType = args[0];
        String input = (args.length > 1) ? args[1] : null;

        String formattedDate = formatDate(outputFormatType,input);
        System.out.println("Formatted Date : " + formattedDate);
    }

    private static String formatDate(String outputFormatType,String input) throws ParseException, IllegalAccessException {
        validate(outputFormatType);
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = getOutputDateFormat(outputFormatType);

        Date date = (input != null) ? inputFormat.parse(input) : new Date();
        return outputFormat.format(date);
    }

    private static void validate(String outputFormatType) throws IllegalAccessException {
        if (!"normal".equalsIgnoreCase(outputFormatType) && !"formatted".equalsIgnoreCase(outputFormatType)) {
            throw new IllegalAccessException("Invalid output format type. Use normal or formatted.");
        }
    }

    private static SimpleDateFormat getOutputDateFormat(String outputFormatType) {
        if ("normal".equalsIgnoreCase(outputFormatType)) {
            return new SimpleDateFormat("yyyy-MM-dd");
        } else {
            return new SimpleDateFormat("yyyy/MM/dd");
        }
    }
}
