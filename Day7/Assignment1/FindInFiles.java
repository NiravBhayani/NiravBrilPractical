package Day7.Assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindInFiles {
    public static void search(String searchText,String path)throws IOException {
        Path dir = Paths.get(path);
        if (Files.exists(dir)) {
            System.out.println("Directory not found");
            return;
        }

        if(Files.isDirectory(dir)){
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
                for (Path file:stream){
                    if (Files.isRegularFile(file)){
                        searchInFile(searchText,file);
                        }
                    }
                }
            }else if (Files.isRegularFile(dir)){
            searchInFile(searchText,dir);
        }
    }

    private static void searchInFile(String searchText,Path file) throws IOException{
        Pattern pattern = Pattern.compile(searchText);
        int lineNumber = 0;

        try (FileSystem fs = FileSystems.newFileSystem(file, null);
             BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(file.getFileName() + " " + lineNumber + ": " + line);
                }
            }
        }
    }
}
