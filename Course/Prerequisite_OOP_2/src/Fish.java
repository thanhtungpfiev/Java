/**
 * tungdt9
 * Jun 7, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class Fish extends Animal {

	/**
	 * @param age
	 * @param gender
	 * @param weightInPounds
	 */
	public Fish(int age, String gender, double weightInPounds) {
		super(age, gender, weightInPounds);
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("Swimming...");
	}

	/* (non-Javadoc)
	 * @see Animal#move()
	 */
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Fish is swimming...");
	}

}
