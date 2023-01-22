package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class VaccineCount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer vcId;
	 private Integer quantity;
	 private Double price;
	 
	 
	 @OneToOne
	 private Vaccine vaccine;
	 
	 @OneToMany(mappedBy="vaccinecount" , cascade = CascadeType.ALL)
	 private List<VaccineInventory> inventoryList = new ArrayList<VaccineInventory>() ;

	public VaccineCount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public VaccineCount(Integer vcId, Integer quantity, Double price, Vaccine vaccine,
			List<VaccineInventory> inventoryList) {
		super();
		this.vcId = vcId;
		this.quantity = quantity;
		this.price = price;
		this.vaccine = vaccine;
		this.inventoryList = inventoryList;
	}



	public Integer getVcId() {
		return vcId;
	}



	public void setVcId(Integer vcId) {
		this.vcId = vcId;
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Vaccine getVaccine() {
		return vaccine;
	}

	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	public List<VaccineInventory> getInventoryList() {
		return inventoryList;
	}

	public void setInventoryList(List<VaccineInventory> inventoryList) {
		this.inventoryList = inventoryList;
	}

	@Override
	public String toString() {
		return "VaccineCount [quantity=" + quantity + ", price=" + price + ", vaccine=" + vaccine + ", inventoryList="
				+ inventoryList + "]";
	}
	 
	 
	 
    

}
