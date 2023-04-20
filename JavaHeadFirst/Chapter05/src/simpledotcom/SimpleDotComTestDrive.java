/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpledotcom;

/**
 * @author thanhtung
 * @date Nov 15, 2016
 */
public class SimpleDotComTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }

}
