package ss16_io_text_file.doc_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("ss16_io_text_file/doc_file/countries.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<Country> countries = new ArrayList<>();

            String[] row = new String[3];
            while ((row[1] = bufferedReader.readLine()) != null) {
                int id = Integer.parseInt(row[0]);
                String code = row[1];
                String name = row[2];
                Country country = new Country(id, code, name);
                countries.add(country);
            }

            for (Country country : countries) {
                System.out.println(country);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

