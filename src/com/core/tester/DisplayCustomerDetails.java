package com.core.tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.core.pojo.Customer;

public class DisplayCustomerDetails {

	static public void getCustomerDetails(ArrayList<Customer> customerList, Scanner scanner) {
		
		System.out.println("Enter email to get details: ");
		String mail = scanner.next();
		
		boolean searchStatus = false;
		for(Customer c : customerList) {
			if(c.getEmail().equals(mail)) {
				System.out.println("Customer details: " + c);
				searchStatus = true;
			}
		}
		
		if(false == searchStatus)
			System.out.println("Details not found");
	}

}
