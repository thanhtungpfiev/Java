/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tapedeck;

/**
 * @author thanhtung
 * @date Oct 23, 2016
 */
public class TapeDeckTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }

}
