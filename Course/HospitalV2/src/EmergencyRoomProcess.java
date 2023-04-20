import domain.Doctor;
import domain.Employee;
import domain.Nurse;

/**
 * tungdt9
 * Jun 23, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class EmergencyRoomProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalManagement ERDirector = new HospitalManagement();

		Employee peggy = new Nurse(1, "peggy", "emergency", true);
		ERDirector.callUpon(peggy);
		
		Employee suzan = new Doctor(2, "Suzan", "emergency", true);
		ERDirector.callUpon(suzan);
	}

}
