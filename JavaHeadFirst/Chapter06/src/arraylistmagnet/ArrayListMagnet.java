/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistmagnet;

import java.util.*;

/**
 * @author thanhtung
 * @date Nov 22, 2016
 */
public class ArrayListMagnet {

    /**
     * @param args the command line arguments
     */

    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printAL(a);
        a.remove(2);
        if (a.contains("three")) {
            a.add("four");
        }
        printAL(a);
        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        if (a.contains("two")) {
            a.add("2.2");
        }
        printAL(a);
    }

}
