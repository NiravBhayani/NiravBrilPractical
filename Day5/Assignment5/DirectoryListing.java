package Day5.Assignment5;

import java.io.File;

public class DirectoryListing {
    private String directoryPath;
    private String[] extensions;
    private boolean recursive;

    public DirectoryListing(){

    }

    public DirectoryListing(String directoryPath, String extensions,boolean recursive) {
        this.directoryPath=directoryPath;
        this.extensions= extensions.split(",");
        this.recursive= recursive;
    }

    public void listFile(){
        File directory = new File(directoryPath);
        if(!directory.exists() || !directory.isDirectory()){
            System.out.println("Error!! File not exist or it is not directory..");
            return;
        }
        listFilesRecursive(directory);
    }

    private void listFilesRecursive(File directory){
        File[] files = directory.listFiles();
        if(files==null) return;
        for (File file:files){
            if(file.isDirectory() && recursive){
                listFilesRecursive(file);
            }else if (file.isFile() && hasValidExtension(file.getName())) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    private boolean hasValidExtension(String fileName){
        if (extensions.length == 1 && extensions[0].equals("*")) {
            return true;
        }
        for (String extension:extensions){
            if (fileName.endsWith(extension.trim())){
                return true;
            }
        }
        return false;
    }
}

