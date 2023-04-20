package reporting;
/**
 * tungdt9
 * Jun 16, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class ReportFormatter {
	public ReportFormatter(Object object, FormatType formatType) {
		switch (formatType) {
		case XML:
			formattedOutput = convertObjectToXML(object);
			break;
		case CSV:
			formattedOutput = convertObjectToCSV(object);
			break;
		default:
			break;
		}
	}
	
	
	private String convertObjectToXML(Object object) {
		return "XML: <title>" + object + "</title>";
	}
	
	private String convertObjectToCSV(Object object) {
		return "CSV: ..." + object + "...";
	}
	
	protected String getFormattedValue() {
		return formattedOutput;
	}
	
	String formattedOutput;
}
