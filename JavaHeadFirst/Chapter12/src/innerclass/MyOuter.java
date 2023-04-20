package innerclass;

/**
 * @author tung.dao
 * @date 3/1/2022
 */
public class MyOuter {
    private int x;
    MyInner inner = new MyInner();

    public void doStuff() {
        inner.go();
    }

    class MyInner {
        void go() {
            x = 42;
        }
    }

    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        System.out.println(outer.x);
        outer.doStuff();
        System.out.println(outer.x);

        MyOuter.MyInner innerObj = outer.new MyInner();
        innerObj.go();
    }
}
