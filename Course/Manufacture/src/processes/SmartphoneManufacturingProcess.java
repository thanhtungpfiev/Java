package processes;
/**
 * tungdt9
 * Jun 27, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

	/**
	 * @param name
	 */
	public SmartphoneManufacturingProcess(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see GeneralManufacturingProcess#assembleDevice()
	 */
	@Override
	protected void assembleDevice() {
		// TODO Auto-generated method stub
		System.out.println("assemble smartphone");
	}

	/* (non-Javadoc)
	 * @see GeneralManufacturingProcess#testDevice()
	 */
	@Override
	protected void testDevice() {
		// TODO Auto-generated method stub
		System.out.println("test smartphone");
	}

	/* (non-Javadoc)
	 * @see GeneralManufacturingProcess#packageDevice()
	 */
	@Override
	protected void packageDevice() {
		// TODO Auto-generated method stub
		System.out.println("package smartphone");
	}

	/* (non-Javadoc)
	 * @see GeneralManufacturingProcess#storeDevice()
	 */
	@Override
	protected void storeDevice() {
		// TODO Auto-generated method stub
		System.out.println("store smartphone");
	}

}
