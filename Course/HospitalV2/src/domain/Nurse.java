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
public class Nurse extends Employee {

	/**
	 * @param id
	 * @param name
	 * @param department
	 * @param working
	 */
	public Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		// TODO Auto-generated constructor stub
		System.out.println("Nurse in action...");
	}
	
	private void checkVitalSigns() {
		System.out.println("checkVitalSigns");
	}
	
	private void drawBlood() {
		System.out.println("drawBlood");
	}
	
	private void cleanPatientArea() {
		System.out.println("cleanPatientArea");
	}

	/* (non-Javadoc)
	 * @see domain.Employee#performDuties()
	 */
	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
	}

}
