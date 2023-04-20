package observers;
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
public class PayrollDepartment implements IObserver {

	/* (non-Javadoc)
	 * @see IObserver#newHireEmployee(domain.Employee)
	 */
	@Override
	public void callMe(Employee emp, String msg) {
		// TODO Auto-generated method stub
		System.out.println("PAYROLL department notified...");
		System.out.println(msg + " " + emp.getName());
	}

}
