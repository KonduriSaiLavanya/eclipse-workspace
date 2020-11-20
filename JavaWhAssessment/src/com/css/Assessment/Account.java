package com.css.Assessment;

	public class Account {
		public String accountnumber;
		private double balance;
		public String accountname;
		
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
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Account(String accountnumber, double balance, String accountname) {
			super();
			this.accountnumber = accountnumber;
			this.balance = balance;
			this.accountname = accountname;
		}
		@Override
		public String toString() {
			return "Account [accountnumber=" + accountnumber + ", balance=" + balance + ", accountname=" + accountname
					+ "]";
		}
		
	}



