package com.vkt.group.ess.api.model;

public class InspectorModel {
	private String name; 
	private String address; 
	private String crossRefId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCrossRefId() {
		return crossRefId;
	}
	public void setCrossRefId(String crossRefId) {
		this.crossRefId = crossRefId;
	}
}
