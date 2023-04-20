/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mix;

/**
 * @author thanhtung
 * @date Nov 15, 2016
 */
public class MixFor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }

}
