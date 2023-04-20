package client;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;
import reporting.ReportFormatter;
import domain.Employee;
import domain.dao.EmployeeDAO;

/**
 * tungdt9
 * Jun 16, 2017
 * TODO
 */

/**
 * @author tungdt9
 * 
 */
public class ClientModule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1, "peggy", "accounting", true);
		ClientModule.hireNewEmployee(employee);
		ClientModule.printEmployeeReport(employee, FormatType.XML);
	}

	public static void hireNewEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.saveEmployee(emp);
	}

	public static void terminateEmployee(Employee emp) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.deleteEmployee(emp);
	}

	public static void printEmployeeReport(Employee emp, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}

}
