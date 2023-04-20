/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle;

/**
 * @author thanhtung
 * @date Dec 19, 2016
 */

interface Nose {
    public int iMethod();
}

abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso {

}

class Acts extends Picasso {
    public int iMethod() {
        return 5;
    }
}

public class Of76 extends Clowns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }

}
