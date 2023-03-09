package ss16_io_text_file.file_unit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUnit {
    public static void writeFile(String string1, String string2) {
        try {
            FileWriter fileWrite = new FileWriter("ss16_io_text_file/file_unit/result_io", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
            bufferedWriter.write(string1);
            bufferedWriter.newLine();
            bufferedWriter.write(string2);

            bufferedWriter.close();
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
                System.out.println(readFile(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
