package com.vkt.group.ess.api.model;

import java.util.ArrayList;

public class FreightChargesModel {
	private String paymentLocationPrepaid; 
	private String paymentLocationCollect; 
	private ArrayList<ChargesModel> charges; 
	private ArrayList<ChargeTotalsModel> chargeTotals; 
	private ArrayList<PrepaidTotalsModel> prepaidTotals;
	public String getPaymentLocationPrepaid() {
		return paymentLocationPrepaid;
	}
	public void setPaymentLocationPrepaid(String paymentLocationPrepaid) {
		this.paymentLocationPrepaid = paymentLocationPrepaid;
	}
	public String getPaymentLocationCollect() {
		return paymentLocationCollect;
	}
	public void setPaymentLocationCollect(String paymentLocationCollect) {
		this.paymentLocationCollect = paymentLocationCollect;
	}
	public ArrayList<ChargesModel> getCharges() {
		return charges;
	}
	public void setCharges(ArrayList<ChargesModel> charges) {
		this.charges = charges;
	}
	public ArrayList<ChargeTotalsModel> getChargeTotals() {
		return chargeTotals;
	}
	public void setChargeTotals(ArrayList<ChargeTotalsModel> chargeTotals) {
		this.chargeTotals = chargeTotals;
	}
	public ArrayList<PrepaidTotalsModel> getPrepaidTotals() {
		return prepaidTotals;
	}
	public void setPrepaidTotals(ArrayList<PrepaidTotalsModel> prepaidTotals) {
		this.prepaidTotals = prepaidTotals;
	}
	
	
}
