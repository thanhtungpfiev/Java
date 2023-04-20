/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xcopy;

/**
 * @author thanhtung
 * @date Nov 12, 2016
 */
public class XCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y); // orig = 42, y = 84
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }

}
