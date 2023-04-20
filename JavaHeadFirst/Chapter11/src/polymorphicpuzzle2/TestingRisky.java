/*
 * File: TestingRisky.java
 * Project: polymorphicpuzzle2
 * File Created: Sunday, 27th February 2022 2:48:11 pm
 * Author: thanhtungpfiev (thanhtungpfiev@gmail.com)
 * -----
 */
package polymorphicpuzzle2;

public class TestingRisky {
    public void doRisky() throws BazEx {
        System.out.println("doRisky");
    }

    public static void main(String[] args) {
        TestingRisky x = new TestingRisky();
        try {
            x.doRisky();
        } catch (BoinkEx boinkEx) {
            // recovery from BoinkEx
        } catch (BiffEx biffEx) {
            // recovery from BiffEx
        } catch (BarEx barEx) {
            // recovery from BarEx
        } catch (FooEx fooEx) {
            // recovery from FooEx
        } catch (BazEx bazEx) {
            // recovery from BazEx
        }
    }
}
