package testbox;

/**
 * @author thanh
 * @date 2/24/2022
 */
public class TestBox {
    Integer i; // have to initialize because i is an object reference and it has null value default
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
