package com.vkt.group.ess.api.model;

public class PrepaidTotalsModel {
	private AmountModel amount;
	private String location;
	public AmountModel getAmount() {
		return amount;
	}
	public void setAmount(AmountModel amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	} 
	
}
