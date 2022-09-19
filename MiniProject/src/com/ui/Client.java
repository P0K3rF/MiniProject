package com.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bean.Customer;
import com.bean.Invoice;
import com.bean.LineItem;
import com.bean.Product;
import com.helper.PrepareData;

@SuppressWarnings("resource")
public class Client {
	static Customer c1;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Customer> customerlist=PrepareData.getAllCustomer();
		List<Product> productlist=PrepareData.getAllProduct();
		List<Customer> listCustomer=new ArrayList<>();
		
		
        boolean flag=false;
        while(!flag){
        	System.out.println("Enter Your Email Address");
    		Scanner sc=new Scanner(System.in);
    		String userEmail=sc.next();
    		listCustomer=customerlist.stream().filter(ue->ue.getEmailAddress().equals(userEmail)).map(up->up).collect(Collectors.toList());
    		if(listCustomer.isEmpty()) {
        		System.out.println("Authentication Failed");
        		continue;
        	}else {
        		flag=true;
        	}
        }
        Random r=new Random();
        int invo=r.nextInt(1000);
    
		
		for(Customer c:listCustomer) {
			c1=c;
		}
		//Initialuzing invoice class
		
		Invoice invoice=new Invoice();
		List<LineItem> li=new ArrayList<>();
		
		double total=0;
		
		while(flag) {
			LineItem lineitem = new LineItem();
			productlist.forEach(System.out::println);
			
			System.out.println("Select Product with id");
			Scanner productid = new Scanner(System.in);
			int pid= productid.nextInt();
			
			List<Product> lp=productlist.stream().filter(prod->prod.getPid()==pid).map(p->p).collect(Collectors.toList());
			
			System.out.println("How much Quantity you want");
			Scanner quanty = new Scanner(System.in);
			int qid= quanty.nextInt();
			
			for(Product p:lp) {
				lineitem.setProduct(p);
				lineitem.setQty(qid);
				lineitem.calculateValue();
				li.add(lineitem);
				invoice.setLineitems(li);
				invoice.setCustomer(c1);
				
				invoice.setDate(LocalDate.of(2022, 9, 20));
				}
			total=total+lineitem.calculateValue();
			invoice.setTotalbill((int)total);
			System.out.println("Do you Wish to buy any other product?");
			Scanner scresult=new Scanner(System.in);
			String a = scresult.next();
;			if(a.equalsIgnoreCase("Yes")) {
				flag=true;
			}else {
				invoice.setInvno(invo);
				System.out.println("-----------------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println();
				System.out.println("Hello "+ invoice.getCustomer().getCustomerName() +" Your Purchased" +invoice.getLineitems()+"\n On " + invoice.getDate() + " and The Total Bill for this is "+ invoice.getTotalbill());
				flag=false;
			}
		}
	}

}
