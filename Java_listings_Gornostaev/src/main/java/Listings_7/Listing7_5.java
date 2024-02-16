package Listings_7;

import java.util.zip.*;
import java.io.*;

public class Listing7_5 {

    public static void exec(String zipFile, String zippedDir)
            throws FileNotFoundException, IOException {

        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(zipFile));
        walkingDir(zos, zippedDir);
        zos.close();
    }

    public static void walkingDir(ZipOutputStream zos, String zippedDir) {

        File zipDir = new File(zippedDir);
        String[] dirList = zipDir.list();

        for (int i = 0; i < dirList.length; i++) {

            File f = new File(zipDir, dirList[i]);

            if (f.isDirectory()) {
                String filePath = f.getPath();
                walkingDir(zos, filePath);
                continue;
            } else {
                try {
                    byte[] readBuffer = new byte[2048];
                    int bytesReaded = 0;

                    String relativePath = f.getPath().substring(zipDir.getPath().length() + 1);
                    System.out.println("\t архивируется " + relativePath);
                    FileInputStream fis = new FileInputStream(f);
                    ZipEntry ze = new ZipEntry(relativePath);
                    zos.putNextEntry(ze);

                    while ((bytesReaded = fis.read(readBuffer)) != -1) {
                        zos.write(readBuffer, 0, bytesReaded);
                    }
                    fis.close();

                } catch (FileNotFoundException fnfe) {
                    System.out.println(fnfe.getMessage());
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }
    }
}
