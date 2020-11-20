package com.css.sample;

import java.util.Arrays;

public class Bank {
private BankAccount [] bankaccount;

/**
 * @return the bankaccount
 */
public BankAccount[] getBankaccount() {
	return bankaccount;
}

/**
 * @param bankaccount the bankaccount to set
 */
public void setBankaccount(BankAccount[] bankaccount) {
	this.bankaccount = bankaccount;
}

public Bank() {
	super();
	// TODO Auto-generated constructor stub
}

public Bank(BankAccount[] bankaccount) {
	super();
	this.bankaccount = bankaccount;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Bank [bankaccount=" + Arrays.toString(bankaccount) + "]";
}





}
