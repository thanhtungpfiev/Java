/**
 * tungdt9
 * Jun 30, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class AccountsReceivable {
	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting aCustomerTransaction) {
		transactionObject = aCustomerTransaction;
	}
	
	public void postPayment() {
		transactionObject.chargeCustomer();
	}
	
	public void sendInvoice() {
		transactionObject.prepareInvoice();
	}
}
