/**
 * tungdt9
 * Aug 1, 2017
 * TODO
 */
package domain;

import java.util.Date;

/**
 * @author tungdt9
 *
 */
public class Employee {
	private String name;
	private Date hireDate;
	private int salary;
	private boolean working = false;
	
	private static int COUNTER;
	public int employeeID;

	/**
	 * @param name
	 * @param hireDate
	 * @param salary
	 * @param working
	 */
	public Employee(String name, Date hireDate, int salary, boolean working) {
		super();
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;
		
		employeeID = ++COUNTER;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", working=" + working
				+ ", employeeID=" + employeeID + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the working
	 */
	public boolean isWorking() {
		return working;
	}

	/**
	 * @param working the working to set
	 */
	public void setWorking(boolean working) {
		this.working = working;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	
	
}
