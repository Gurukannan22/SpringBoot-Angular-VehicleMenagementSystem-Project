package com.gavs.VehicleManagement.VMEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicle {

	@Column
	private String customername;
	@Column
	private String phoneno;
	@Id
	@Column
	private int vid;

	@Column
	private String vtype;

	@Column
	private String fueltype;

	@Column
	private String model;

	@Column
	private double price;

	@Column
	private String color;

	public String getCustomername() {
		return customername;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public int getVid() {
		return vid;
	}

	public String getVtype() {
		return vtype;
	}

	public String getFueltype() {
		return fueltype;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
