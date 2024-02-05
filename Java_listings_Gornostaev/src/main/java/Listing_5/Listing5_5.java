package Listing_5;

import java.io.File;

public class Listing5_5 {

    public static void main(String[] args) {
        String dirPath = "your_directory_path_here";
        sameDateToDirFiles(dirPath);
    }

    public static void sameDateToDirFiles(String dir) {
        long modified = System.currentTimeMillis();
        File walkDir = new File(dir);
        File[] dirList = walkDir.listFiles(); // use listFiles() instead of list()

        if (dirList != null) {
            for (File file : dirList) {
                if (file.isDirectory()) {
                    sameDateToDirFiles(file.getAbsolutePath());
                } else {
                    // for files, set the last modified date
                    file.setLastModified(modified);
                }
            }
        }
    }
}
