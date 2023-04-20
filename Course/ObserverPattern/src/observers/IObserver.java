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
public interface IObserver {
	public void callMe(Employee emp, String msg);
}
