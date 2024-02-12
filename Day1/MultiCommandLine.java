package Day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiCommandLine {
    public void doOperation(String[] args) { // 1 2 3 4 5 6 7
        if (args.length < 2) {
            // coma , cpase, -,
            System.out.println("Invalid command. Give minimum one argument ");
            return;
        }
        int command = Integer.parseInt(args[0]);

        switch (command) {
            case 1:
                addNum(args);
                break;
            case 2:
                changeCase(args);
                break;
            default:
                System.out.println("Invalid command");
        }
    }

    public void addNum(String[] args) {
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            String num = String.valueOf(args[i]);
            if (!"".equals(num)){
                char[] ch = num.toCharArray();
                if (isDigit(ch[0])) {

                    // 1) get value
                    // 2) validate number or char
                    // if number then sum
                    // else if char then skip

                    int num2 = Integer.parseInt(args[i]);

                    sum += num2;
                    System.out.println(sum);
                }
            }
        }
    }

    int number(String num) {

        return Integer.parseInt(num);
    }

    public boolean isDigit(Character num) {
        return Character.isDigit(num);
    }

    public void changeCase(String[] args) {


        for (int i = 1; i < args.length; i++) {
            String text = args[i];
            char[] arr = text.toCharArray();
            for (char c : arr) {
                String CharAsString = String.valueOf(c);

                Pattern pattern = Pattern.compile("[a-zA-Z]");
                Matcher matcher = pattern.matcher(CharAsString);

                if (matcher.matches()) {
                    System.out.println(args[i].toLowerCase() + " ");
                }else {
                    System.out.println("Digit is not allowed in 2nd command!!!");
                }
            }
        }
        System.out.println();
    }

}
