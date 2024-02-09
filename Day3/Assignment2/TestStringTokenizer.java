package Day3.Assignment2;

import Day3.Assignment2.String_Tokenizer;

import java.util.Arrays;

public class TestStringTokenizer {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please give comma separated String");
            return;
        }
            String_Tokenizer t1 = new String_Tokenizer();
            t1.column( Arrays.toString(args));
    }
}