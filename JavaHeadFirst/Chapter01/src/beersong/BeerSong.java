/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beersong;

/**
 * @author thanhtung
 * @date Oct 3, 2016
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
        } // end while loop
        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
        } else {
            System.out.println("No more bottles of beer on the wall");
        } // end else
    } // end main method
} // end class
