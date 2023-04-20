/**
 * tungdt9
 * May 30, 2017
 * TODO
 */


/**
 * @author tungdt9
 *
 */
public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal sparrow1 = new Sparrow(1, "M", 4);
//		sparrow1.move();
		
		Animal fish1 = new Fish(1, "M", 2);
//		fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);
	}
	
	public static void moveAnimals(Animal animal) {
		animal.move();
	}
}
