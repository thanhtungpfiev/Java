package polymorphicpuzzle1;

/*
 * File: TestingRisky.java
 * Project: polymorphicpuzzle1
 * File Created: Sunday, 27th February 2022 2:31:32 pm
 * Author: thanhtungpfiev (thanhtungpfiev@gmail.com)
 * -----
 */
public class TestingRisky {
    public void doRisky() throws AlphaEx, BetaEx, GammaEx, DeltaEx {
        System.out.println("doRisky");
    }

    public static void main(String[] args) {
        TestingRisky x = new TestingRisky();
        try {
            x.doRisky();
        } catch (AlphaEx a) {
            // recovery from AlphaEx
        } catch (BetaEx b) {
            // recovery from BetaEx
        } catch (GammaEx c) {
            // recovery from GammaEx
        } catch (DeltaEx d) {
            // recovery from DeltaEx
        }
    }
}
