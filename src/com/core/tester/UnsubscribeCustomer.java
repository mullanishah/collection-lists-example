package com.core.tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.core.pojo.Customer;

public class UnsubscribeCustomer {

	public static void unsubscribe(ArrayList<Customer> customerList, Scanner scanner) {

		System.out.println("Enter Email Id to unsubscribe: ");
		Customer cust = new Customer(scanner.next());

		int index = customerList.indexOf(cust);
		if(index == -1) {
			System.out.println("Customer details with given email id not found !!");
		} else {
			cust = customerList.remove(index);
			System.out.println("Customer details erased successfully, details: " + cust);
		}
	}
}
