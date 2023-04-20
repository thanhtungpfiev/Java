package domain.dao;
import database.DatabaseConnectionManager;
import domain.Employee;

/**
 * tungdt9
 * Jun 16, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class EmployeeDAO {
	public void saveEmployee(Employee emp) {
		DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
		System.out.println("save employ: " + emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("delete employ: " + emp);
	}
}
