package com.bean;

public class Customer {
	private String customerName;
	private String customerAddress;
	private String emailAddress;
	private String phone;
	public String getCustomerName() {
		return customerName;
	}
	
	public Customer(String customerName, String customerAddress, String emailAddress, String phone) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.emailAddress = emailAddress;
		this.phone = phone;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress + ", emailAddress="
				+ emailAddress + ", phone=" + phone + "]";
	}
	
}
