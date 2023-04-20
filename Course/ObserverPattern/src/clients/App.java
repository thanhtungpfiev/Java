package clients;
import java.util.Date;

import observers.HRDepartment;
import observers.IObserver;
import observers.PayrollDepartment;
import subjects.EmployeeManagementSystem;

import domain.Employee;

/**
 * tungdt9
 * Aug 1, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		Employee bob = new Employee("Bob", new Date(), 35000, true);
		
		ems.hireNewEmployee(bob);
		
		ems.modifyEmployeeName(5, "Imtiaz");
	}
	
	
}
