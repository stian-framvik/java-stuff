package MyLibrarian.src.mylibrarian;

import java.io.File;

public class FileHarvester {
    public static void main(String[] args) {

        String userName = "User";

        // Define source and target directories.
        File sourceDirectory = new File("E:\\Zotero\\storage\\");
        File targetDirectory = new File("C:\\Users\\" + userName + "\\Documents\\Library\\unsorted\\");

        // Run method to list all files in the given directory.
        searchAllFilesInDirectory(sourceDirectory, targetDirectory);
    }

    public static void searchAllFilesInDirectory(File sourceDirectory, File targetDirectory) {
        
        // Check if the source directory is valid.
        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            System.out.println("The source directory does not exist or is not a directory.");
            return;
        }
        
        // Check if the target directory is valid.
        if (!targetDirectory.exists() || !targetDirectory.isDirectory()) {
            System.out.println("The target directory does not exist or is not a directory.");
            return;
        }
        
        // Create array of files from source directory.
        File[] files = sourceDirectory.listFiles();

        // Check if array of files is null.
        if (files == null) {
            System.out.println("The directory is empty or does not exist");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                searchAllFilesInDirectory(file, targetDirectory);
            } else {
                if (FileUtility.isFilePDF(file)) {
                    FileMover.moveFile(file, targetDirectory);
                }
            }
        }
    }
}