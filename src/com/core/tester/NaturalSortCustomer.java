package com.core.tester;

import java.util.ArrayList;
import java.util.Collections;
import com.core.pojo.Customer;
import com.core.utils.CustomerUtils;

public class NaturalSortCustomer {
		
	public static void sortCustomerNatural(ArrayList<Customer> customerList) {
		
		System.out.println("\nCustomer list before sort: " );
		CustomerUtils.printFormattedCustomers(customerList);
		
		Collections.sort(customerList);			
							//if pojo is not implementing comparable interface then compilation error
		System.out.println("\nCustomer list after sort: (On email)");
		CustomerUtils.printFormattedCustomers(customerList);
	}
}
