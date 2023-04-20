package be_the_compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Admin
 * @date 3/12/2022
 */
class Animal {

}

class Dog extends Animal {

}
public class TestAnimal {
    public static void main(String[] args) {
//         ArrayList<Dog> dogs1 = new ArrayList<Animal>(); // java: incompatible types: java.util.ArrayList<be_the_compiler.Animal> cannot be converted to java.util.ArrayList<be_the_compiler.Dog>
//         ArrayList<Animal> animals1 = new ArrayList<Dog>(); // java: incompatible types: java.util.ArrayList<be_the_compiler.Dog> cannot be converted to java.util.ArrayList<be_the_compiler.Animal>
    }
    List<Animal> list = new ArrayList<Animal>();
    ArrayList<Dog> dogs = new ArrayList<Dog>();
//    ArrayList<Animal> animals = dogs; // java: incompatible types: java.util.ArrayList<be_the_compiler.Dog> cannot be converted to java.util.ArrayList<be_the_compiler.Animal>
    List<Dog> dogList = dogs;
    ArrayList<Object> objects = new ArrayList<Object>();
    List<Object> objectList = objects;
//    ArrayList<Object> objs = new ArrayList<Dog>(); // java: incompatible types: java.util.ArrayList<be_the_compiler.Dog> cannot be converted to java.util.ArrayList<java.lang.Object>
}
