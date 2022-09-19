package com.bean;

public class LineItem {

	Product product;
	int qty;
	double total;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double calculateValue()
	{
	return this.total=this.product.getPrice()*this.qty;
	}
	
	@Override
	public String toString() {
		return product.getPname() + " And Price is " + product.getPrice();
	}
	
}
