package com.vkt.group.ess.api.model;

import java.util.ArrayList;

public class CargosModel {
	private String cargoName; 
	private String cargoDescription; 
	private String marksAndNumbers; 
	private ArrayList<PackagingModel> packaging;
	public String getCargoName() {
		return cargoName;
	}
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	public String getCargoDescription() {
		return cargoDescription;
	}
	public void setCargoDescription(String cargoDescription) {
		this.cargoDescription = cargoDescription;
	}
	public String getMarksAndNumbers() {
		return marksAndNumbers;
	}
	public void setMarksAndNumbers(String marksAndNumbers) {
		this.marksAndNumbers = marksAndNumbers;
	}
	public ArrayList<PackagingModel> getPackaging() {
		return packaging;
	}
	public void setPackaging(ArrayList<PackagingModel> packaging) {
		this.packaging = packaging;
	}
	
	
}
