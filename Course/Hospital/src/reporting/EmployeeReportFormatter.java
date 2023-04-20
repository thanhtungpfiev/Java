package reporting;
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
public class EmployeeReportFormatter extends ReportFormatter {
	/**
	 * @param object
	 * @param formatType
	 */
	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
		// TODO Auto-generated constructor stub
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
	
}
