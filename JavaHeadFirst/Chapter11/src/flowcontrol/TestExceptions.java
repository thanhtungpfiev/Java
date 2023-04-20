/*
 * File: TestExceptions.java
 * Project: flowcontrol
 * File Created: Friday, 25th February 2022 5:18:34 pm
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
package flowcontrol;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "no";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (ScaryException ex) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("end risky");
        return;
    }
}
