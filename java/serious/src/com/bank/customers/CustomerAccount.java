package com.bank.customers;

public class CustomerAccount {
	long customerId;
	String customerName;
	String email;
	long phoneNumber;
	String address;
	String accountType;
	double balance;
	 boolean kycStatus;

	 public CustomerAccount() {
		    this(0, null, null, 0, null, "null", 0.0, false);
		}

		public CustomerAccount(String customerName, long phoneNumber) {
		    this(0, customerName, null, phoneNumber, null, "null", 0.0, false);
		}

		public CustomerAccount(String customerName, long phoneNumber, String accountType) {
		    this(0, customerName, null, phoneNumber, null, accountType, 0.0, false);
		    System.out.println("Customer Profile Initialized — Status: Pending KYC");
		}

		public CustomerAccount(long customerId, String customerName, String email, long phoneNumber,
		                       String address, String accountType, double balance, boolean kycStatus) {

		    this.customerId = customerId;
		    this.customerName = customerName;
		    this.email = email;
		    this.phoneNumber = phoneNumber;
		    this.address = address;
		    this.accountType = accountType;
		    this.balance = balance;
		    this.kycStatus = kycStatus;
		}

	    public void setCustomerName(String name) {
	        if (name != null && !name.equals("")) {
	            this.customerName = name;
	        } else {
	            System.out.println("Invalid Name");
	        }
	    }
	    public void setEmail(String email) {
	    	if (email == null || email.contains("@"))
	    	{ 
	    		this.email = email;
	    		} 
	    	else 
	    	{ 
	    		System.out.println("Invalid Email");
	    	} 
	    	}
	    public void setPhoneNumber(long phone) {

	        long temp = phone;
	        int count = 0;

	        while (temp != 0) {
	            temp = temp / 10;
	            count++;
	        }

	        if (count == 10) {
	            this.phoneNumber = phone;   // ✅ original number stored
	        } else {
	            System.out.println("Invalid number");
	        }
	    }

	    public void setAccountType(String type) {
	        if (type == null) return;

	        type = type.toUpperCase();

	        if (type.equals("SAVINGS") || type.equals("CURRENT") ||
	            type.equals("SALARY") || type.equals("PREMIUM")) {

	            this.accountType = type;
	        } else {
	            System.out.println("Invalid Account Type");
	        }
	    }
	    public void setBalance(double bal) {
	        if (bal >= 0) {
	            this.balance = bal;
	        } else {
	            System.out.println("Balance cannot be negative");
	        }
	    }
	    public void setAddress(String add)
	    {
	    	
	    	if(add==null && add.equals(""))
	    	{
	    		System.out.println("invalid address");
	    	}
	    	else
	    	{
	    		this.address=add;
	    	}
	    }
	    
	    
	    
	    public void activateKYC(String documentType) {
	        if (documentType != null && !documentType.isEmpty()) {
	            kycStatus = true;
	            System.out.println("KYC Activated using " + documentType);
	        }
	    }

	    public String getMaskedPhone() {
	    	String phone=""+phoneNumber;
	        if (phone == null) return "N/A";
	        return "XXXXXX" + phone.substring(6);
	    }
	    public void viewAccountSummary() {
	        System.out.println("---- Account Summary ----");
	        System.out.println("Name: " + customerName);
	        System.out.println("Phone: " + getMaskedPhone());
	        System.out.println("Type: " + accountType);
	        System.out.println("Balance: " + balance);
	        System.out.println("KYC Status: " + (kycStatus ? "Verified" : "Pending"));
	    }
	    public void deposit(double amt) {
	        if (amt > 0) {
	            balance += amt;
	        }
	    }

	    public void withdraw(double amt) {

	        if (!kycStatus && amt > 10000) {
	            System.out.println("KYC Required for high value withdrawal");
	            return;
	        }

	        if (amt > balance) {
	            System.out.println("Insufficient Balance");
	            return;
	        }

	        balance -= amt;
	    }
	}



