package com.vkt.group.ess.api.model;

import java.util.ArrayList;

public class ParcelModel {
	
	//Module Declaration 
	private String parcelRef; 
	private String blNumber; 
	private String blDocumentName;
	private String blDate;
	private String contractNumber;
	private String issueDate;
	private String placeOfReceipt;
	private String placeOfDelivery;
	private String placeOfIssue;
	private String loadingLocation;
	private String destination;
	
	//Declare Module class
	private DestinationCountryModel destinationCountry;
	private String billOfLadingClause;
	
	private ArrayList<NotifyPartiesModel> notifyParties; 
	private CarrierModel carrier;
	private ShipperModel shipper; 
	private ConsigneeModel consignee; 
	private String totalContainers; 
	private ArrayList<CargosModel> cargos; 
	private int numberOfContainers; 
	private ArrayList<ContainersModel> containers; 
	private FreightChargesModel freightCharges;
	public String getParcelRef() {
		return parcelRef;
	}
	public void setParcelRef(String parcelRef) {
		this.parcelRef = parcelRef;
	}
	public String getBlNumber() {
		return blNumber;
	}
	public void setBlNumber(String blNumber) {
		this.blNumber = blNumber;
	}
	public String getBlDocumentName() {
		return blDocumentName;
	}
	public void setBlDocumentName(String blDocumentName) {
		this.blDocumentName = blDocumentName;
	}
	public String getBlDate() {
		return blDate;
	}
	public void setBlDate(String blDate) {
		this.blDate = blDate;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getPlaceOfReceipt() {
		return placeOfReceipt;
	}
	public void setPlaceOfReceipt(String placeOfReceipt) {
		this.placeOfReceipt = placeOfReceipt;
	}
	public String getPlaceOfDelivery() {
		return placeOfDelivery;
	}
	public void setPlaceOfDelivery(String placeOfDelivery) {
		this.placeOfDelivery = placeOfDelivery;
	}
	public String getPlaceOfIssue() {
		return placeOfIssue;
	}
	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}
	public String getLoadingLocation() {
		return loadingLocation;
	}
	public void setLoadingLocation(String loadingLocation) {
		this.loadingLocation = loadingLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public DestinationCountryModel getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(DestinationCountryModel destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getBillOfLadingClause() {
		return billOfLadingClause;
	}
	public void setBillOfLadingClause(String billOfLadingClause) {
		this.billOfLadingClause = billOfLadingClause;
	}
	public ArrayList<NotifyPartiesModel> getNotifyParties() {
		return notifyParties;
	}
	public void setNotifyParties(ArrayList<NotifyPartiesModel> notifyParties) {
		this.notifyParties = notifyParties;
	}
	public CarrierModel getCarrier() {
		return carrier;
	}
	public void setCarrier(CarrierModel carrier) {
		this.carrier = carrier;
	}
	public ShipperModel getShipper() {
		return shipper;
	}
	public void setShipper(ShipperModel shipper) {
		this.shipper = shipper;
	}
	public ConsigneeModel getConsignee() {
		return consignee;
	}
	public void setConsignee(ConsigneeModel consignee) {
		this.consignee = consignee;
	}
	public String getTotalContainers() {
		return totalContainers;
	}
	public void setTotalContainers(String totalContainers) {
		this.totalContainers = totalContainers;
	}
	public ArrayList<CargosModel> getCargos() {
		return cargos;
	}
	public void setCargos(ArrayList<CargosModel> cargos) {
		this.cargos = cargos;
	}
	public int getNumberOfContainers() {
		return numberOfContainers;
	}
	public void setNumberOfContainers(int numberOfContainers) {
		this.numberOfContainers = numberOfContainers;
	}
	public ArrayList<ContainersModel> getContainers() {
		return containers;
	}
	public void setContainers(ArrayList<ContainersModel> containers) {
		this.containers = containers;
	}
	public FreightChargesModel getFreightCharges() {
		return freightCharges;
	}
	public void setFreightCharges(FreightChargesModel freightCharges) {
		this.freightCharges = freightCharges;
	}
	@Override
	public String toString() {
		return "ParcelModel [parcelRef=" + parcelRef + ", blNumber=" + blNumber + ", blDocumentName=" + blDocumentName
				+ ", blDate=" + blDate + ", contractNumber=" + contractNumber + ", issueDate=" + issueDate
				+ ", placeOfReceipt=" + placeOfReceipt + ", placeOfDelivery=" + placeOfDelivery + ", placeOfIssue="
				+ placeOfIssue + ", loadingLocation=" + loadingLocation + ", destination=" + destination
				+ ", destinationCountry=" + destinationCountry + ", billOfLadingClause=" + billOfLadingClause
				+ ", notifyParties=" + notifyParties + ", carrier=" + carrier + ", shipper=" + shipper + ", consignee="
				+ consignee + ", totalContainers=" + totalContainers + ", cargos=" + cargos + ", numberOfContainers="
				+ numberOfContainers + ", containers=" + containers + ", freightCharges=" + freightCharges + "]";
	}
	
}
