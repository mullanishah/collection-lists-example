package com.core.pojo;

import java.util.Date;
import com.core.utils.StringUtils;

public class Customer implements Comparable<Customer> {
	
	private int custId;
	private String name;
	private String email;
	private String password;
	private Date birthdate;
	private double regAmount;
	
	public Customer(String name, String email, String password, Date birthdate, double regAmount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.birthdate = birthdate;
		this.regAmount = regAmount;
	}

	/* sample toString()
	 * @Override public String toString() { return "\n " + email.substring(0,
	 * email.indexOf('@'))+ " [" + email + ", " +
	 * StringUtils.getSdf().format(birthdate) + ", Rs." + regAmount + "]"; }
	 */
	
	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", birthdate=" + StringUtils.getSdf().format(birthdate) + ", regAmount=" + regAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Customer))
			return false;
		return email.equals(((Customer)obj).email); //down-casting
	}
	
	@Override
	public int compareTo(Customer cust) {
		return this.email.compareTo(cust.getEmail());
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public boolean setPassword(String password) {
		this.password = password;
		return true;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
}
