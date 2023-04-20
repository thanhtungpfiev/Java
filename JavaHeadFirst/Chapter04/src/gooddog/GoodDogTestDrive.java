/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gooddog;

/**
 * @author thanhtung
 * @date Nov 12, 2016
 */
public class GoodDogTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }

}
