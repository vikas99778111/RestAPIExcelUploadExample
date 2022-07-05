package com.vkt.group.ess.api.model;

public class WeightModel {
	private double quantityGross; 
	private double quantityNet; 
	private String crossRefId;
	private String format;
	private String label;
	
	public double getQuantityGross() {
		return quantityGross;
	}
	public void setQuantityGross(double quantityGross) {
		this.quantityGross = quantityGross;
	}
	public double getQuantityNet() {
		return quantityNet;
	}
	public void setQuantityNet(double quantityNet) {
		this.quantityNet = quantityNet;
	}
	public String getCrossRefId() {
		return crossRefId;
	}
	public void setCrossRefId(String crossRefId) {
		this.crossRefId = crossRefId;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
