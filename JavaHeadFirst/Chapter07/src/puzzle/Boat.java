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
public class Boat {
    private int length;

    public void setLengtth(int len) {
        length = len;
    }

    public int getLength() {
        return length;
    }

    public void move() {
        System.out.print("drift ");
    }
}
