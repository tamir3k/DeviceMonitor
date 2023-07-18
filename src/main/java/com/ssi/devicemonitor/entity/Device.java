package com.ssi.devicemonitor.entity;

public abstract class Device {
	
    private String name;
    private String status;
    
    //general device fields
    private String manufacturer;
    private String deviceType;
    private String version;
    
    public Device(String name) {
        this.name = name;
        this.status = "Offline"; // Set initial status to Offline
    }

    public Device(String name,String type) {
    	this.name = name;
    	this.deviceType = type;
    	this.status = "Offline"; // Set initial status to Offline
    	
    }

    
    public String getName() {
        return name;
    }

    public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
