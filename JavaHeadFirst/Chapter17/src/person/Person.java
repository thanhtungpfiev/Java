package person;

/**
 * @author Admin
 * @date 3/12/2022
 */
public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
