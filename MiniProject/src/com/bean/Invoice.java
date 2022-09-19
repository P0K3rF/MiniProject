package com.bean;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
	private int invno;
	private Customer customer;
	private LocalDate date;
	private List<LineItem> lineitems;
	private int totalbill;
	public int getInvno() {
		return invno;
	}
	public void setInvno(int invno) {
		this.invno = invno;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<LineItem> getLineitems() {
		return lineitems;
	}
	public void setLineitems(List<LineItem> lineitems) {
		this.lineitems = lineitems;
	}
	public int getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(int totalbill) {
		this.totalbill = totalbill;
	}
	
	
}
