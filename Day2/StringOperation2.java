package Day2;

public class StringOperation2{
    public void doOperation(String[] args){
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
        int countOfLowerCaseChar = 0;
        int upper = 0;
        int digit = 0;

        for (int i = 1; i < args.length; i++) {
            String text =  args[i];
            char[] arr = text.toCharArray();

            for(char c:arr) {
                if (Character.isUpperCase(c)) {
                    upper++;
                } else if (Character.isLowerCase(c)) {
                    countOfLowerCaseChar ++;
                } else if (Character.isDigit(c)) {
                    digit ++;
                }
                }
        }
        System.out.println("Uppercase is "+ upper);
        System.out.println("Lowercase is "+ countOfLowerCaseChar);
        System.out.println("Digit is "+ digit);


    }
}
