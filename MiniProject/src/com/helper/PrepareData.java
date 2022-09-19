package com.helper;

import java.util.Arrays;
import java.util.List;

import com.bean.Customer;
import com.bean.Product;

public class PrepareData {
	
	public static List<Customer> getAllCustomer(){
		
		List<Customer> customerlist = Arrays.asList(
				new Customer("Asif","Mumbra","asifshaikhacmelal@gmail.com","8108662192"),
				new Customer("Rushi","Kalamboli","Rushi@gmail.com","8108662192"),
				new Customer("Danny","Ulhasnagar","Danny@gmail.com","8108662192"),
				new Customer("Subham","Kalamboli","Subham@gmail.com","8108662192"),
				new Customer("Khalil","Mankhurd","Khalil@gmail.com","8108662192"),
				new Customer("Nishant","Gharse ata hai","Nishant@gmail.com","8108662192")
				);
		return customerlist;
		
	}
	
	public static List<Product> getAllProduct(){
		List<Product> productlist = Arrays.asList(
				new Product(1,"Veg Biryani",100),
				new Product(2,"Egg Biryani",150),
				new Product(3,"Chicken Biryani",200),
				new Product(4,"Mutton Biryani",250),
				new Product(5,"Fish Biryani",300),
				new Product(6,"Khabsa Biryani",400),
				new Product(7,"Fried Rice",80),
				new Product(8,"Noddels",900),
				new Product(9,"Triple Rice",180),
				new Product(10,"Korean Rice",220),
				new Product(11,"HongKong Rice",200),
				new Product(12,"Singapure Rice",190)
				);
		return productlist;
	}
	
}
