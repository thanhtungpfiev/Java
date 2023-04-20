/**
 * tungdt9
 * Jun 26, 2017
 * TODO
 */
package object;

import action.IOnOffAction;

/**
 * @author tungdt9
 *
 */
public class Projector implements IOnOffAction {

	/* (non-Javadoc)
	 * @see action.IOnOffAction#on()
	 */
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName() + " on");
	}

	/* (non-Javadoc)
	 * @see action.IOnOffAction#off()
	 */
	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(getClass() + " off");
		
	}
	
}
