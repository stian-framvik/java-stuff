package MyLibrarian.src.mylibrarian;

import java.io.File;

public class FileUtility {

    // Get file extension -> check if it's a .pdf file.
    public static boolean isFilePDF(File file) {
        String fileExtension = getFileExtension(file);
        return "pdf".equalsIgnoreCase(fileExtension);
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