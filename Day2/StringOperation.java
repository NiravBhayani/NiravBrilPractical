package Day2;

import java.util.regex.*;
public class StringOperation {
    public void doOperationWithRegEx(String[] args){
        if (args.length < 2){
            System.out.println("Invalid command. Give 1 0r 2 argument ");
            return;
        }
        int command = Integer.parseInt(args[0]);

        switch(command){
            case 1:
                reverseWord(args);
                break;
            case 2:
                characterCounts(args);
                break;
            default:
                System.out.println("Invalid command");
        }
    }
    public static void reverseWord(String[] args){
        StringBuilder sb = new StringBuilder(args[1]).reverse();
        System.out.println(sb);
    }
    public void characterCounts(String[] args){
        int lower = 0;
        int upper = 0;
        int digit = 0;

        Pattern lowerPattern = Pattern.compile("[a-z]");
        Pattern upperPattern = Pattern.compile("[A-Z]");
        Pattern digitPattern = Pattern.compile("[0-9]");

        for (int i = 1; i < args.length; i++) {
            String text = args[i];
            char[] arr = text.toCharArray();
            for (char c : arr) {
                String CharAsString = String.valueOf(c);

                Matcher lowerMatcher = lowerPattern.matcher(CharAsString);
                Matcher upperMatcher = upperPattern.matcher(CharAsString);
                Matcher digitMatcher = digitPattern.matcher(CharAsString);

                if (lowerMatcher.matches()) {
                    lower++;
                } else if (upperMatcher.matches()) {
                    upper++;
                } else if (digitMatcher.matches()) {
                    digit++;
                }
            }
        }
        System.out.println("Uppercase is "+ upper);
        System.out.println("Lowercase is "+ lower);
        System.out.println("Digit is "+ digit);
    }
}