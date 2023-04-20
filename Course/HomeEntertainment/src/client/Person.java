/**
 * tungdt9
 * Jun 26, 2017
 * TODO
 */
package client;

import object.Projector;
import object.SurroundSoundSystem;
import object.TV;
import action.IOnOffAction;
import controller.RemoteControl;

/**
 * @author tungdt9
 *
 */
public class Person {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();

		IOnOffAction projector = new Projector();
		remote.connectDevice(projector);
		remote.onDevice();
		remote.offDevice();

		IOnOffAction tv = new TV();
		remote.connectDevice(tv);
		remote.onDevice();
		remote.offDevice();
		
		IOnOffAction surroundSoundSystem = new SurroundSoundSystem();
		remote.connectDevice(surroundSoundSystem);
		remote.onDevice();
		remote.offDevice();
	}
}
