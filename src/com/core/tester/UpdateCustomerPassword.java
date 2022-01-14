package com.core.tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.core.pojo.Customer;

public class UpdateCustomerPassword {
	
	public static void updatePassword(ArrayList<Customer> customerList, Scanner scanner) {
		
		boolean updateStatus = false;
		System.out.println("Enter Email Id to update: ");
		Customer customer = new Customer(scanner.next());
		
		if(customerList.contains(customer)) {
			System.out.println("Enter new password: ");
			String newPwd = scanner.next();
			System.out.println((customer.setPassword(newPwd)) ? "Password updated successfully !!" : "Password not updated, please try again.");;
			updateStatus = true;
		}
		
		if(false == updateStatus)
			System.out.println("Customer details with given email id not found !!");
	}

}
