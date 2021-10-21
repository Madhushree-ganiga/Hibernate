package com.wolken.store.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="market_details")
public class MarketDetails {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private int noOfShops;
	@Column
	private String type;
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNoOfShops() {
		return noOfShops;
	}


	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "MarketDetails [id=" + id + ", name=" + name + ", location=" + location + ", noOfShops=" + noOfShops
				+ ", type=" + type + "]";
	}

	
}
