package com.vkt.group.ess.api.model;

public class ChargeTotalsModel {
	private AmountModel amount; 
	private String paymentType;
	public AmountModel getAmount() {
		return amount;
	}
	public void setAmount(AmountModel amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	} 
}
