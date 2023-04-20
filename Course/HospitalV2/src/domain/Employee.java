package domain;
/**
 * tungdt9
 * Jun 16, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public abstract class Employee {
	private long id;
	private String name;
	private String department;
	private boolean working;
	/**
	 * @param id
	 * @param name
	 * @param department
	 * @param working
	 */
	public Employee(long id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department="
				+ department + ", working=" + working + "]";
	}
	
	public abstract void performDuties();
	
}
