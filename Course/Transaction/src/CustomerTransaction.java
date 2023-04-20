import java.util.Date;
import java.util.List;


/**
 * tungdt9
 * Jun 30, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class CustomerTransaction implements Accounting, Reporting {
	private List<Product> products;
	
	private Customer customer;
	
	public CustomerTransaction(Customer customer, List<Product> products) {
		this.products = products;
		this.customer = customer;
	}
	// methods for reporting
	/* (non-Javadoc)
	 * @see Reporting#getName()
	 */
	@Override
	public String getName() {
		return customer.getName();
	}
	
	/* (non-Javadoc)
	 * @see Reporting#getDate()
	 */
	@Override
	public Date getDate() {
		return new Date();
	}
	
	/* (non-Javadoc)
	 * @see Reporting#productBreakDown()
	 */
	@Override
	public String productBreakDown() {
		String reportList = "";
		for (Product product : products) {
			reportList += product.getProductName();
		}
		return reportList;
	}
	
	// methods for account receivable
	/* (non-Javadoc)
	 * @see Accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice() {
		System.out.println("prepareInvoice");
	}
	
	/* (non-Javadoc)
	 * @see Accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer() {
		System.out.println("chargeCustomer");
	}
}
