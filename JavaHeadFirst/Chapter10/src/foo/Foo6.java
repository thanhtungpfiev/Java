package foo;

import java.util.ArrayList;

/**
 * @author thanh
 * @date 2/24/2022
 */
public class Foo6 {
    int x = 12;
    public static void go(final int x) {
        System.out.println(x);
    }

    public void doNumsNewWay() {
        ArrayList<Integer> listofNumbers = new ArrayList<Integer>();
        listofNumbers.add(3);
        int num = listofNumbers.get(0);
    }
}
