package circle;

/**
 * @author tung.dao
 * @date 1/26/2022
 */
public class Circle {
    public static void main(String[] args) {
//        int x = 34.5; // Incompatible types. Found: 'double', required: 'int'
//        boolean boo = x; // Incompatible types. Found: 'int', required: 'boolean'
        int g = 17; // OK
        int y = g; // OK
        y = y + 10; // OK
        short s; // OK
//        s = y; // Incompatible types. Found: 'int', required: 'short'
        byte b = 3; // OK
        byte v = b; // OK
        short n = 12; // OK
//        v = n; // Incompatible types. Found: 'short', required: 'byte'
//        byte k = 128; // Incompatible types. Found: 'int', required: 'byte'
    }
}
