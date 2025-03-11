package MyLibrarian.src.mylibrarian;

import java.io.File;

public class PDFHarvester {

    // The main function goes on top, probably?
    public static void main(String[] args) {

        // TODO: Prompt user for 'directoryPath' & create File[] = new File(directoryPath).

        // Run method to list all files in the given directory.
        listAllFilesInDirectory(new File("E:\\Zotero\\storage\\"));
    }

    public static void listAllFilesInDirectory(File directory) {
        // Create File array from directory.
        File[] files = directory.listFiles();

        // If-statement to catch empty arrays. If 'null', then print error.
        if (files != null) {

            // Loop through all files in the 'files' array.
            for (File file : files) {
                if (file.isDirectory()) {
                    listAllFilesInDirectory(file);
                }
                else {
                    String fileExtension = getFileExtension(file);

                    if ("pdf".equals(fileExtension)) {
                        System.out.println("File: " + file.getName());
                    }
                }
            }
            } else { 
            System.out.println("The directory is empty or does not exist.");
            }
        }

    // Method for extracting file extensions.
    public static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        else {
            return name.substring(lastIndexOf + 1);
        }
   }
}

// else {
//     // System.out.println("File: " + file.getName());
//     String fileExtension = getFileExtension(file);
//     if (fileExtension == ".pdf") {
//         System.out.println("File extension: " + fileExtension);
//     }
// }
// }