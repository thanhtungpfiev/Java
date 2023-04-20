package parts;
/**
 * tungdt9
 * Jul 27, 2017
 * TODO
 */

/**
 * @author tungdt9
 *
 */
public class LargeEngine implements Engine {
	
	private int horsePower;
	
	public LargeEngine(int horsePower) {
		this.horsePower = horsePower;
	}

	/* (non-Javadoc)
	 * @see Engine#startEngine()
	 */
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("started large " + horsePower + " hp engine");
	}

}
