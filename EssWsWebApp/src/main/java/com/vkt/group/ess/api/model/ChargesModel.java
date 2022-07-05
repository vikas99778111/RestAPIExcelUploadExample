package com.vkt.group.ess.api.model;

public class ChargesModel {
	private String code;
	private String tariffItem;
	private String freightedAs;
	private int rate;
	private AmountModel amount;
	private String prepaidType; 
	private String exchangeRate;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTariffItem() {
		return tariffItem;
	}
	public void setTariffItem(String tariffItem) {
		this.tariffItem = tariffItem;
	}
	public String getFreightedAs() {
		return freightedAs;
	}
	public void setFreightedAs(String freightedAs) {
		this.freightedAs = freightedAs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public AmountModel getAmount() {
		return amount;
	}
	public void setAmount(AmountModel amount) {
		this.amount = amount;
	}
	public String getPrepaidType() {
		return prepaidType;
	}
	public void setPrepaidType(String prepaidType) {
		this.prepaidType = prepaidType;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	} 
	
}
