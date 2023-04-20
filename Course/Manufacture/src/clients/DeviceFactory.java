package clients;
import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

/**
 * tungdt9
 * Jun 27, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class DeviceFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
		manufacturer.launchProcess();
	}

}
