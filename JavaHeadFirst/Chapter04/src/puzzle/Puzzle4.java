/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puzzle;

/**
 * @author thanhtung
 * @date Nov 12, 2016
 */
public class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }

        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("result " + result);
    }
}

class Puzzle4b {
    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}