/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multifor;

/**
 * @author thanhtung
 * @date Nov 15, 2016
 */
public class MultiFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }
}
