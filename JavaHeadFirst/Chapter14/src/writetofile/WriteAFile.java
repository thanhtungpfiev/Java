package writetofile;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author tung.dao
 * @date 3/7/2022
 */
public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
