/**
 * tungdt9
 * Jun 26, 2017
 * TODO
 */
package controller;

import action.IOnOffAction;

/**
 * @author tungdt9
 *
 */
public class RemoteControl {
	public void connectDevice(IOnOffAction device) {
		System.out.println("connect to device " + device.getClass().getName());
		this.device = device;
	}
	
	public void onDevice() {
		device.on();
	}
	
	public void offDevice() {
		device.off();
	}
	
	IOnOffAction device;
}
