package com.java4s.pojo;

import java.io.Serializable;

public class AccountDetails implements Serializable {

	    private static final long serialVersionUID = -3760445487636086034L;
	    private String accountNo;
	    private String accountName;
	    private String address;
	    private String accountStatus;
	    private double depositAmount;
	    
		
		public double getDepositAmount() {
			return depositAmount;
		}
		public void setDepositAmount(double depositAmount) {
			this.depositAmount = depositAmount;
		}
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAccountStatus() {
			return accountStatus;
		}
		public void setAccountStatus(String accountStatus) {
			this.accountStatus = accountStatus;
		}

	   
		@Override
		public String toString() {
		    String output = "Account No: " + accountNo + " Account Name: " + accountName +
		        " address: " + address + " depositAmount: " + depositAmount ;

		    System.out.println("Output :" +output);
		    
		    return output;
		}
}
