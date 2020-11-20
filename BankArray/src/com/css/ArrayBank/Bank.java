package com.css.ArrayBank;

public class Bank {
	public String accountnumber;
	private double balance;
	public String accountname;
	 public int lastAssignedNo;
	 
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(double balance, String accountname, int lastAssignedNo) {
		super();
		this.balance = balance;
		this.accountname = accountname;
		this.lastAssignedNo = lastAssignedNo;
	}
	@Override
	public String toString() {
		return "Bank [accountnumber=" + accountnumber + ", balance=" + balance + ", accountname=" + accountname
				+ ", lastAssignedNo=" + lastAssignedNo + "]";
	}
}
