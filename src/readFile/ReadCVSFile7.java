package readFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCVSFile7 {

    public static void main(String[] args) {

        String csvFile = "d:/country.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[1] + " , name=" + country[2] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
