/**
 * tungdt9
 * Jul 27, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class Vehicle {
	Engine myEngine;
	
	public Vehicle(Engine anEngine) {
		myEngine = anEngine;
	}
	
	public void crankIgnition() {
		myEngine.startEngine();
		System.out.println("Vehicle is running");
	}
}
