/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dog;

/**
 * @author thanhtung
 * @date Nov 12, 2016
 */
public class Dog {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
