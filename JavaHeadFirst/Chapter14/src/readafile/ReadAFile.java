package readafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author tung.dao
 * @date 3/8/2022
 */
public class ReadAFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
