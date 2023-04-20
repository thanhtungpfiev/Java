package legal;

/**
 * @author tung.dao
 * @date 1/28/2022
 */
public class CalcArea {
    public int calcArea(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        CalcArea cal = new CalcArea();
        int a = cal.calcArea(7, 12); // legal
        short c = 7; // legal
        cal.calcArea(c, 15); // legal
//        int d = cal.calcArea(57); // illegal: miss width
        cal.calcArea(2, 3); // legal
        long t = 42;
//        int f = cal.calcArea(t, 17); // illegal: pass long to int
//        int g = cal.calcArea(); // illegal: miss width and height
//        cal.calcArea(); // illegal: miss width and height
//        byte h = cal.calcArea(4, 20); // illegal: return byte instead int
//        int j = cal.calcArea(2, 3, 5); // 3rd parameter excess
    }
}
