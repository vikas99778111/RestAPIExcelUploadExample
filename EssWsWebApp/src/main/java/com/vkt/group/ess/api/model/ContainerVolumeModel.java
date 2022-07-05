package com.vkt.group.ess.api.model;

public class ContainerVolumeModel {
	private int quantityGross;
	private int quantityNet;
	private String crossRefId;
	private String format;
	private String label;
	
	public int getQuantityGross() {
		return quantityGross;
	}
	public void setQuantityGross(int quantityGross) {
		this.quantityGross = quantityGross;
	}
	public int getQuantityNet() {
		return quantityNet;
	}
	public void setQuantityNet(int quantityNet) {
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
