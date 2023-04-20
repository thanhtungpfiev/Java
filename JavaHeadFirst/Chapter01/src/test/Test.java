/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 * @author thanhtung
 * @date Oct 6, 2016
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int y = 0;
        while (x < 5) {
            if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y +" ");
            x = x + 1;
        }
    }
}
