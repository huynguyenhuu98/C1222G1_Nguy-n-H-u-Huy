package ss16_io_text_file.file_unit;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            FileReader fileReader = new FileReader("ss16_io_text_file/file_unit/source.txt");
            FileWriter fileWriter = new FileWriter("ss16_io_text_file/file_unit/target.txt", true);

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file does not exist");
        } catch (NullPointerException e) {
            System.out.println("file empty");
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
            assert bufferedWriter != null;
            bufferedWriter.close();
        }
        System.out.println("Display string");
    }
}

