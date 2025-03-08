package MyLibrarian.src.mylibrarian;

import java.io.File;

public class PDFHarvester {

    // The main function goes on top, probably?
    public static void main(String[] args) {

        // TODO: Prompt user for 'directoryPath' & create File[] = new File(directoryPath).

        // Run method to list all files in the given directory.
        listAllFilesInDirectory(new File("E:\\Zotero\\storage\\"));
    }

    static void listAllFilesInDirectory(File directory) {
        // Create File array from directory.
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    
                    listAllFilesInDirectory(file);
                }
                else {
                    System.out.println("File: " + file.getName());
                }
            }
        } else { 
            System.out.println("The directory is empty or does not exist.");
        }
    }
}