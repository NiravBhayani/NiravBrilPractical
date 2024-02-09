package Day4.Assignment7;

import java.io.File;

public class FileInfo {
    public void displayFileInfo(String filepath) {
        File file = new File(filepath);

        if(file.exists()){
            System.out.println("File or Directory: "+file.getName());
            System.out.println("Path is "+file.getAbsolutePath());

            if(file.isDirectory()){
                System.out.println("It is Directory");
                long totalSize = getTotalSize(file);
                System.out.println("Total size is "+ totalSize );
            }else {
                System.out.println("It is File");
                System.out.println("Size is "+file.length());
            }
            }else {
            System.out.println("This file is not exist");
        }
    }

    private long getTotalSize(File directory){
        long totalSize = 0;
        File[] files = directory.listFiles();

        if(files != null) {
            for (File file:files){
                if(file.isFile()){
                    totalSize += file.length();
                }else if (file.isDirectory()){
                    totalSize += getTotalSize(file);
                }
            }
        }
        return totalSize;
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Please provide a path");
            return;
        }

        String filePath = args[0];
        FileInfo fileInfo = new FileInfo();
        fileInfo.displayFileInfo(filePath);
    }
}
