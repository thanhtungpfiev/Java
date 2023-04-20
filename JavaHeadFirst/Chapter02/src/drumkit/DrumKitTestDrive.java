/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drumkit;

/**
 * @author thanhtung
 * @date Oct 25, 2016
 */
public class DrumKitTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
    }

}
