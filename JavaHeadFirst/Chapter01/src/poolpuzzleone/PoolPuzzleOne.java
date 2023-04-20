/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolpuzzleone;

/**
 * @author thanhtung
 * @date Oct 23, 2016
 */
public class PoolPuzzleOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }

            if (x == 1) {
                System.out.print("noys");
            }

            if (x < 1) {
                System.out.print("oise");
            }

            System.out.println("");

            x = x + 1;
        }
    }

}
