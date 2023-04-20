package iftest;

/**
 * @author tung.dao
 * @date 1/24/2022
 */
public class IfTest2 {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is NOT 3");
        }
        System.out.println("This runs no matter what");
    }
}
