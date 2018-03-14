package readInput;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputUsingBuffered {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            String name = br.readLine();
     
            // Printing the read line
            System.out.println(name);   

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}