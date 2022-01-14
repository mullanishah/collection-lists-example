package com.core.utils;

import java.util.Comparator;
import com.core.pojo.Customer;

public class CustomSorter implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {		//Ascending order
		if(o1.getRegAmount() < o2.getRegAmount())
			return -1;
		else if(o1.getRegAmount() > o2.getRegAmount())
			return 1;
		return 0;
	}

}
