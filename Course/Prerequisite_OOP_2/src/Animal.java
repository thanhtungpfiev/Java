/**
 * tungdt9
 * May 30, 2017
 * TODO
 */


/**
 * @author tungdt9
 *
 */
public abstract class Animal {
	int age;
	String gender;
	double weightInPounds;
	
	public Animal(int age, String gender, double weightInPounds) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
	

}
