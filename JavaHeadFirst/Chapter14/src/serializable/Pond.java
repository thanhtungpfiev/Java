package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Admin
 * @date 3/6/2022
 */
public class Pond implements Serializable {
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
