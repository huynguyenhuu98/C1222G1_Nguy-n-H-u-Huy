package case_study_module2.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> readFile(String path) {
        FileReader fileReader =null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}
