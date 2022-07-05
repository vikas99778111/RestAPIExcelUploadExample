package com.vkt.group.ess.api.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class EssJsonRequestMapper {

	@JsonProperty
	private String shipmentReference; 
	@JsonProperty
	private String shipmentType; 
	@JsonProperty
	private boolean autoCollaboration; 
	@JsonProperty
	private ArrayList<ParcelModel> parcels; 
	@JsonProperty
	private String externalReference; 
	@JsonProperty
	private String locale; 
	@JsonProperty
	private String quantityFormat;
	@JsonProperty
	private VesselModel vessel; 
	@JsonProperty
	private String voyageReference; 
	@JsonProperty
	private String exportReference; 
	@JsonProperty
	private ShipAgentModel shipAgent; 
	@JsonProperty
	private FreightForwarderModel freightForwarder; 
	@JsonProperty
	private InspectorModel inspector; 
	@JsonProperty
	private String serviceTypeAtReceipt; 
	@JsonProperty
	private String serviceTypeAtDelivery; 
	@JsonProperty
	private String loadType;

	public String getShipmentReference() {
		return shipmentReference;
	}
	public void setShipmentReference(String shipmentReference) {
		this.shipmentReference = shipmentReference;
	}
	public String getShipmentType() {
		return shipmentType;
	}
	public void setShipmentType(String shipmentType) {
		this.shipmentType = shipmentType;
	}
	public boolean getAutoCollaboration() {
		return autoCollaboration;
	}
	public void setAutoCollaboration(boolean autoCollaboration) {
		this.autoCollaboration = autoCollaboration;
	}
	public ArrayList<ParcelModel> getParcels() {
		return parcels;
	}
	public void setParcel(ArrayList<ParcelModel> parcels) {
		this.parcels = parcels;
	}
	public String getExternalReference() {
		return externalReference;
	}
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getQuantityFormat() {
		return quantityFormat;
	}
	public void setQuantityFormat(String quantityFormat) {
		this.quantityFormat = quantityFormat;
	}
	public VesselModel getVessel() {
		return vessel;
	}
	public void setVessel(VesselModel vessel) {
		this.vessel = vessel;
	}
	public String getVoyageReference() {
		return voyageReference;
	}
	public void setVoyageReference(String voyageReference) {
		this.voyageReference = voyageReference;
	}
	public String getExportReference() {
		return exportReference;
	}
	public void setExportReference(String exportReference) {
		this.exportReference = exportReference;
	}
	public ShipAgentModel getShipAgent() {
		return shipAgent;
	}
	public void setShipAgent(ShipAgentModel shipAgent) {
		this.shipAgent = shipAgent;
	}
	public FreightForwarderModel getFreightForwarder() {
		return freightForwarder;
	}
	public void setFreightForwarder(FreightForwarderModel freightForwarder) {
		this.freightForwarder = freightForwarder;
	}
	public InspectorModel getInspector() {
		return inspector;
	}
	public void setInspector(InspectorModel inspector) {
		this.inspector = inspector;
	}
	public String getServiceTypeAtReceipt() {
		return serviceTypeAtReceipt;
	}
	public void setServiceTypeAtReceipt(String serviceTypeAtReceipt) {
		this.serviceTypeAtReceipt = serviceTypeAtReceipt;
	}
	public String getServiceTypeAtDelivery() {
		return serviceTypeAtDelivery;
	}
	public void setServiceTypeAtDelivery(String serviceTypeAtDelivery) {
		this.serviceTypeAtDelivery = serviceTypeAtDelivery;
	}
	public String getLoadType() {
		return loadType;
	}
	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}


