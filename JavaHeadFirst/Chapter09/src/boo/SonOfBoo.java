/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boo;

/**
 * @author thanhtung
 * @date Dec 24, 2016
 */
public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("Boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

    public SonOfBoo(int i, String s) {
        // not existence of Boo()
    }

    public SonOfBoo(String a, String b, String c) {
        // Not existence of Boo(String, String)
        super(a, b);

    }

    public SonOfBoo(int i, int j) {
        super("man", j);
    }

    public SonOfBoo(int i, int x, int y) {
        // Not existence of Boo(int, String)
        super(i, "start");
    }
}
