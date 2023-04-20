package bethecompiler;

/**
 * @author thanh
 * @date 2/24/2022
 */
class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper() {
        System.out.println("super constructor");
    }
}
