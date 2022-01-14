package com.core.tester;

import java.util.ArrayList;
import java.util.Collections;
import com.core.pojo.Customer;
import com.core.utils.CustomSorter;
import com.core.utils.CustomerUtils;

public class CustomSortCustomer {
	
	public static void sortCustomerNatural(ArrayList<Customer> customerList) {
		
		System.out.println("\nCustomer list before sort: ");
		CustomerUtils.printFormattedCustomers(customerList);
		
		Collections.sort(customerList, new CustomSorter());			
		
		System.out.println("\nCustomer list after sort: (on Reg Amount)");
		CustomerUtils.printFormattedCustomers(customerList);
	}
}
