/*
 * File: GC.java
 * Project: GarbageCollector
 * File Created: Sunday, 13th February 2022 5:03:29 pm
 * Author: thanhtungpfiev (thanhtungpfiev@gmail.com)
 * -----
 */
package GarbageCollector;

public class GC {
    public static GC doStuff() {
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        // call more methods
    }

    public static void doStuff2(GC copyGC) {
        GC localGC = copyGC;
    }
}
