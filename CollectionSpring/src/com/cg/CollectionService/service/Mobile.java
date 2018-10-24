package com.cg.CollectionService.service;

import java.util.List;

public class Mobile {
	int  mobileid;
	String mobileName;
	double mobileprice;
	List<Inventory> invent;
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(double mobileprice) {
		this.mobileprice = mobileprice;
	}
	public List<Inventory> getInvent() {
		return invent;
	}
	public void setInvent(List<Inventory> invent) {
		this.invent = invent;
	}
	public void printmobiledetails(){
		System.out.println("ID is"+mobileid+"Mobile Name is "+mobileName+"price is"+mobileprice);
		
		for(Inventory in: invent){
			System.out.println("mobile count is"+in.mobilecount+" mobile comapany"+in.mobilecompany);
		}
			
		}

}
