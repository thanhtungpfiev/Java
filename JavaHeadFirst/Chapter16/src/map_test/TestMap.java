package map_test;

import java.util.HashMap;

/**
 * @author Admin
 * @date 3/12/2022
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
