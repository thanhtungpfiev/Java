/**
 * tungdt9
 * Jun 30, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class ReportGenerator {
	private Reporting transactionObject;
	
	public void generate() {
		System.out.println(transactionObject.getName() 
				+ " " + transactionObject.getDate() 
				+ " " + transactionObject.productBreakDown());
	}
}
