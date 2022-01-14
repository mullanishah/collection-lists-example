package com.core.tester;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import com.core.pojo.Customer;
import com.core.utils.StringUtils;

public class MainTester {

	private static ArrayList<Customer> customerList = null;
	private static Scanner scanner = null;
	static {
		customerList  = RegisterDefaultCustomers.getRegisteredCustomers(customerList);
		scanner = StringUtils.getScanner();
	}
	
	public static void main(String[] args) {
		int choice = 0;
		try {
			do {
				StringUtils.printLine();
				System.out.println("### MENU ### \n"
						+ "1.Register new customer \t2.Unsubscibe existing "
						+ "\n3.Update password \t4.Display details "
						+ "\n5.Sort(On Email) \t6.Sort(on Reg.Amount) "
						+ "\n7.Display all customers \t8.Exit");
				
				System.out.println("Enter your choice: ");
				choice = scanner.nextInt();
				
				switch(choice) {
				case 1: 
					CheckAndRegisterCustomer.checkAndRegisterCustomer(customerList, scanner);
					break;
				case 2:
					UnsubscribeCustomer.unsubscribe(customerList, scanner);
					break;
				case 3:
					UpdateCustomerPassword.updatePassword(customerList, scanner);
					break;
				case 4:
					DisplayCustomerDetails.getCustomerDetails(customerList, scanner);
					break;
				case 5:
					NaturalSortCustomer.sortCustomerNatural(customerList);
					break;
				case 6:
					CustomSortCustomer.sortCustomerNatural(customerList);
					break;
				case 7:
					RegisterDefaultCustomers.printAllFormattedCustomers(customerList);
					break;
				case 8:
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
				}
				
			}while(choice != 8);
			
		} catch (Exception e) {
			if(e instanceof ParseException)
				e.printStackTrace();
			else
				e.printStackTrace();
		}

	}
	
}
