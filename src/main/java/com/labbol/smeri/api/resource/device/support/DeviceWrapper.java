/**
 * 
 */
package com.labbol.smeri.api.resource.device.support;

public class DeviceWrapper {

	private Device device;

	public DeviceWrapper() {
		
	}
	
	public DeviceWrapper(Device device) {
		this.device = device;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	
}
