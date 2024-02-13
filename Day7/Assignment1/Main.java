package Day7.Assignment1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <searchText> <dir|file>");
            return;
        }

        String searchText = args[0];
        String path = args[1];

        try {
            FindInFiles.search(searchText, path);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
