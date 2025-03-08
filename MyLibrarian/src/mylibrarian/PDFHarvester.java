package MyLibrarian.src.mylibrarian;

import java.io.File;

public class PDFHarvester {
    public static void main(String[] args) {
        // String directoryString = "E:\Zotero\storage";

        File[] files =  new File("E:\\Zotero\\storage").listFiles();
        

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
            }
            else {
                System.out.println("File " + file.getName());
            }
        }
    }
}
