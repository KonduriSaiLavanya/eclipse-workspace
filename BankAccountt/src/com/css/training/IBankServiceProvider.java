package com.css.training;
public interface IBankServiceProvider {
	public Bank checkaccount(String accountNumber);
	public double getbalance(String accountNumber);
	public boolean withdrawmoney(String accountNumber,double amount);
	public boolean deppositmoney(String accountNumber,double amount);
	public boolean transfermoney(String fromAccountNumber,String toAccountNumber,double amount);
	
}
