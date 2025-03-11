package MyLibrarian.src.mylibrarian;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileMover {

    public static void moveFile(File sourceFile, File targetDirectory) {
        File targetFile = new File(targetDirectory, sourceFile.getName());
        try {
            Files.move(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved " + sourceFile.getName());
        } catch (IOException e) {
            System.err.println("Failed to move file: " + e.getMessage());
        }
    }
}