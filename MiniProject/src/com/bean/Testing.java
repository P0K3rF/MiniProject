package com.bean;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.helper.PrepareData;

public class Testing {
	public static void main(String[] args) {
		List<Customer> customer=PrepareData.getAllCustomer();
		
		
		System.out.println("Enter Your Email:-");
		Scanner sc=new Scanner(System.in);
		String userEmail=sc.next();
		
        List<Customer>listCustomer=customer.stream().filter(ue->ue.getEmailAddress().equals(userEmail)).map(cust->cust).collect(Collectors.toList());
        if(listCustomer.isEmpty()) {
        	System.out.println("Empty List");
        }else {
        	System.out.println(listCustomer);
        }
	}
}
