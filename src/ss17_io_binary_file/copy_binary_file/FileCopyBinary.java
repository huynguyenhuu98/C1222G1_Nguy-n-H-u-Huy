package ss17_io_binary_file.copy_binary_file;

import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: FileCopy <source file> <target file>");
        }

        String sourceFile = "ss17_io_binary_file/copy_binary_file/source.txt";
        String targetFile = "ss17_io_binary_file/copy_binary_file/target.txt";

        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(targetFile, true)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully, " + bytesRead + " bytes copied.");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
