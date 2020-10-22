package com.cts.capstone.vnf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="vnfdetails")
public class VnfDetails {
	@Id	
	@Column(name="service_id")
	int serviceID;
	@Column(name="service_type")
	String serviceType;
	@Column(name="service_name")
	String serviceName;
	@Column(name="service_size")
	char serviceSize;
	public int getServiceID() {
		return serviceID;
	}
	public VnfDetails() {
		super();
	}
	public VnfDetails(int serviceID, String serviceType, String serviceName, char serviceSize) {
		super();
		this.serviceID = serviceID;
		this.serviceType = serviceType;
		this.serviceName = serviceName;
		this.serviceSize = serviceSize;
	}
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public char getServiceSize() {
		return serviceSize;
	}
	public void setServiceSize(char serviceSize) {
		this.serviceSize = serviceSize;
	}
	
}
