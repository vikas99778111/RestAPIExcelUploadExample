package com.vkt.group.ess.api.model;

public class ContainersModel {
	private String containerNumber;
	private String containerType;
	private String containerTypeDescription;
	private String packingUnit;
	private String sealNumber;
	private int totalNumberOfPackingItems; 
	private ContainerQuantityModel containerQuantity;
	private ContainerVolumeModel containerVolume;
	public String getContainerNumber() {
		return containerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public String getContainerType() {
		return containerType;
	}
	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}
	public String getContainerTypeDescription() {
		return containerTypeDescription;
	}
	public void setContainerTypeDescription(String containerTypeDescription) {
		this.containerTypeDescription = containerTypeDescription;
	}
	public String getPackingUnit() {
		return packingUnit;
	}
	public void setPackingUnit(String packingUnit) {
		this.packingUnit = packingUnit;
	}
	public String getSealNumber() {
		return sealNumber;
	}
	public void setSealNumber(String sealNumber) {
		this.sealNumber = sealNumber;
	}
	public int getTotalNumberOfPackingItems() {
		return totalNumberOfPackingItems;
	}
	public void setTotalNumberOfPackingItems(int totalNumberOfPackingItems) {
		this.totalNumberOfPackingItems = totalNumberOfPackingItems;
	}
	public ContainerQuantityModel getContainerQuantity() {
		return containerQuantity;
	}
	public void setContainerQuantity(ContainerQuantityModel containerQuantity) {
		this.containerQuantity = containerQuantity;
	}
	public ContainerVolumeModel getContainerVolume() {
		return containerVolume;
	}
	public void setContainerVolume(ContainerVolumeModel containerVolume) {
		this.containerVolume = containerVolume;
	} 
	
	

}
