/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hobbit;

/**
 * @author thanhtung
 * @date Oct 28, 2016
 */
public class Hobbits {

    /**
     * @param args the command line arguments
     */
    String name;

    public static void main(String[] args) {
        // TODO code application logic here

        Hobbits[] h = new Hobbits[3];
        int z = 0; // arrays alwasy start with index 0

        while (z < 3) {
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }

}
