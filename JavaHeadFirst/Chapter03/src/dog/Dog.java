/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dog;

/**
 * @author thanhtung
 * @date Oct 28, 2016
 */
public class Dog {

    /**
     * @param args the command line arguments
     */

    String name;

    public static void main(String[] args) {
        // TODO code application logic here
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // now make a Dog array
        Dog[] myDogs = new Dog[3];
        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // Hmmm... what is myDogs[2] name?
        System.out.print("last dog's name is");
        System.out.println(myDogs[2].name);

        // now loop through the array and tell all dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

    }

    public void bark() {
        System.out.println(name + " says Ruff");
    }

    public void eat() {

    }

    public void chaseCat() {

    }

}
