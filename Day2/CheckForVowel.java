package Day2;

public class CheckForVowel {
    public static void main(String[] args) {
        if(args.length == 1 && args[0].length() == 1){
            char input = args[0].charAt(0);

            VowelConsonant check = new VowelConsonant();
            check.checkChar(input);
        }else {
            System.out.println("Only single character is allowed");
        }
    }
}
