package com.vkt.group.ess.api.model;

public class PackagingModel {
	private int numberOfPackingItems; 
	private String packingUnit; 
	private WeightModel weight; 
	private VolumeModel volume;
	public int getNumberOfPackingItems() {
		return numberOfPackingItems;
	}
	public void setNumberOfPackingItems(int numberOfPackingItems) {
		this.numberOfPackingItems = numberOfPackingItems;
	}
	public String getPackingUnit() {
		return packingUnit;
	}
	public void setPackingUnit(String packingUnit) {
		this.packingUnit = packingUnit;
	}
	public WeightModel getWeight() {
		return weight;
	}
	public void setWeight(WeightModel weight) {
		this.weight = weight;
	}
	public VolumeModel getVolume() {
		return volume;
	}
	public void setVolume(VolumeModel volume) {
		this.volume = volume;
	} 
	
	
}
