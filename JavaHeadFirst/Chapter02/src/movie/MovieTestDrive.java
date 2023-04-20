/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movie;

/**
 * @author thanhtung
 * @date Oct 23, 2016
 */
public class MovieTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but untimately uplifting";
        three.rating = 127;

    }

}
