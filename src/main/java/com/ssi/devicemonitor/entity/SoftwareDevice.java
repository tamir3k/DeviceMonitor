package com.ssi.devicemonitor.entity;

import java.util.Date;

public class SoftwareDevice extends Device {
	
	Date installationDate;
   
	public SoftwareDevice(String name) {
        super(name,"Software");
    }

	public Date getInstallationDate() {
		return installationDate;
	}

	public void setInstallationDate(Date installationDate) {
		this.installationDate = installationDate;
	}
}
