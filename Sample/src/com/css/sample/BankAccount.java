package com.css.sample;

public class BankAccount {
	private String AccountNo;
	private String AccountName;
	private double balance;
	
	public static int lastAssignedNo;
	static 
	{
		 lastAssignedNo=0;
	}
	
	
	
	
	
	
	
	public BankAccount(String accountName) {
		super();
		this.AccountName = accountName;
		this.balance=1000;
		this.AccountNo=Integer.toString(lastAssignedNo+1);
	}
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return AccountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return AccountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(String accountNo, String accountName) {
		super();
		this.AccountNo = accountNo;
		this.AccountName = accountName;
		this.balance = 1000;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [AccountNo=" + AccountNo + ", AccountName=" + AccountName + ", balance=" + balance + "]";
	}
	
	

}
