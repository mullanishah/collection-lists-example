package com.core.tester;

import static com.core.utils.CustomerUtils.getCustomerArray;
import static com.core.utils.StringUtils.getSdf;
import java.util.ArrayList;
import com.core.pojo.Customer;

public class RegisterDefaultCustomers {

	public static ArrayList<Customer> getRegisteredCustomers(ArrayList<Customer> customerList){

		if(null == customerList)
			customerList = new ArrayList<Customer>(getCustomerArray().length);

		for(Customer cust : getCustomerArray()) {
			customerList.add(cust);
		}
		return customerList;
	}


	public static void printAllFormattedCustomers(ArrayList<Customer> customerList){

		StringBuffer buffer = new StringBuffer();
		for(Customer c : customerList) {
			buffer.append(new String(c.getName() + "\t"
					+ " (" + c.getEmail() + " | " + getSdf().format(c.getBirthdate()) + " | "+ c.getRegAmount() + ")," 
					+ "\n"));
		}
		System.out.println(buffer);
	}

}
