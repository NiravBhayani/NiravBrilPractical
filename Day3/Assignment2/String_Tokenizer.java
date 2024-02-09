package Day3.Assignment2;

import java.util.StringTokenizer;

public class String_Tokenizer {
    public void column(String input) {
        StringTokenizer s1 = new StringTokenizer(input, ",");

        while (s1.hasMoreTokens()) {
            System.out.println(s1.nextToken().trim());
        }
    }
}
