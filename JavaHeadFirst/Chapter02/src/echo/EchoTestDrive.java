/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package echo;

/**
 * @author thanhtung
 * @date Oct 25, 2016
 */
public class EchoTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
                e2.count = e2.count + 1;
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;
            }

            x = x + 1;
        }
        System.out.println(e2.count);
    }

}
