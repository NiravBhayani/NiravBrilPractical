package Day3.Assignment6;

import java.text.DecimalFormat;

public class FormattedNumber {
    public static void main(String[] args) throws IllegalAccessException {
        if(args.length < 2 ){
            throw new IllegalAccessException("Invalid Argument.Valid only: OutputFormatType Number");
        }
        String outputFormatType = args[0];
        double number = Double.parseDouble(args[1]);

        String format = formatNumber(outputFormatType,number);
        System.out.println("Formatted Number:" + format);
    }

    public static String formatNumber(String outputFormatType, double number) throws IllegalAccessException {
        DecimalFormat decimalFormat;

        switch (outputFormatType.toLowerCase()){
            case "decimal":
                decimalFormat = new DecimalFormat("#,##0.00");
                break;
            case"integer":
                decimalFormat = new DecimalFormat("#,###");
                break;
            default:
                throw new IllegalAccessException("Invalid type. Use decimal or integer ");
        }
        return decimalFormat.format(number);
    }
}
