package bethecompiler;

/**
 * @author tung.dao
 * @date 1/24/2022
 */
public class Exercise1a {
    public static void main(String [] args) {
        int x = 1;
        while ( x < 10 ) {
            if ( x > 3) {
                System.out.println("big x");
            }
        }
    }
}

// This file can be compiled but loop run forever
