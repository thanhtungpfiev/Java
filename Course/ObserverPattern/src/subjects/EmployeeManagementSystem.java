package subjects;

import java.util.ArrayList;
import java.util.List;
import observers.IObserver;
import domain.Employee;
import domain.EmployeeDAO;

/**
 * tungdt9
 * Aug 1, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class EmployeeManagementSystem implements ISubject {
	private List<IObserver> observers;
	private List<Employee> employees;
	
	private EmployeeDAO employeeDao;
	private Employee employee;
	private String msg;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDao = new EmployeeDAO();
		employees = employeeDao.generateEmployees();
	}
	
	public void hireNewEmployee(Employee emp) {
		employee = emp;
		msg = "New  Hire: ";
		employees.add(emp);
		notifyObservers();
	}
	
	public void modifyEmployeeName(int id, String newName) {
		boolean notify = false;
		for (Employee emp : employees) {
			if (id == emp.employeeID) {
				emp.setName(newName);
				this.employee = emp;
				this.msg = "Employee name has been modified";
				notify = true;
				break;
			}
		}
		if (notify) {
			notifyObservers();
		}
	}
	
	/* (non-Javadoc)
	 * @see ISubject#registerObserver(IObserver)
	 */
	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	/* (non-Javadoc)
	 * @see ISubject#removeObserver(IObserver)
	 */
	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	/* (non-Javadoc)
	 * @see ISubject#notifyObserver(IObserver)
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (IObserver o : observers) {
			o.callMe(employee, msg);
		}
		
	}

}
