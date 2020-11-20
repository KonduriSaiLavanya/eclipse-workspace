package com.css.ArrayBank;

public interface IBankServiceProvider {
	
public void BankAccountcheckAccount(String accountNo);

public double getBalance(Bank account);

public boolean depositMoney(Bank account, double amount);

public boolean withdrawMoney(Bank account, double amount);

public boolean transferMoney(Bank fromAccount, Bank toAccountamount);
		


}
