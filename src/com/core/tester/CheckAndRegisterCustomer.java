package com.core.tester;

import java.util.ArrayList;
import java.util.Scanner;
import com.core.pojo.Customer;
import com.core.utils.StringUtils;

public class CheckAndRegisterCustomer {

	public static void checkAndRegisterCustomer(ArrayList<Customer> customerList, Scanner scanner) throws Exception {

		boolean exit = false;
		while(exit != true) {
			System.out.println("Do you want to add more customer: (y/n)");
			if(scanner.next().equalsIgnoreCase("n")) {
				exit = true;
			} else {
				System.out.println("Enter email id:");
				String mail = scanner.next();
				Customer cust = new Customer(mail);
				
				if(customerList.contains(cust)) {
					System.out.println("Email id already exists, please try again with different email !!");
				} else {
					System.out.println("Enter remaining details (Name, Password, B'Date (dd/MM/yyyy), Reg.Amount): ");
					customerList.add(new Customer(scanner.next(), mail, scanner.next(), StringUtils.getSdf().parse(scanner.next()), 
														scanner.nextDouble()));
					System.out.println("Customer details registered successfully!!");
				}
			}
		}
	}

}
