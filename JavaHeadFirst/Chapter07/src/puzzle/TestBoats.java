/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle;

/**
 * @author thanhtung
 * @date Dec 11, 2016
 */

public class TestBoats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLengtth(32);
        b1.move();
        b3.move();
        b2.move();
    }

}
