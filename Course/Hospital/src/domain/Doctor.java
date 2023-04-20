/**
 * tungdt9
 * Jun 23, 2017
 * TODO
 */
package domain;

/**
 * @author tungdt9
 *
 */
public class Doctor extends Employee {

	/**
	 * @param id
	 * @param name
	 * @param department
	 * @param working
	 */
	public Doctor(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		// TODO Auto-generated constructor stub
		System.out.println("Doctor in action...");
	}

}
