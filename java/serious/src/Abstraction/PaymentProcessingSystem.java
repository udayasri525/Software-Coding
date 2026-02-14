package Abstraction;
abstract class payment{
abstract void processPaymet();
abstract void validateTransaction();
public void generateTransactionId() {
	System.out.println("Generated transaction ID:");
}
}
class CreditCardPayment extends payment{

public String cardNumber;
public String expiryDate; 
public String cvv;
public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
	super();
	this.cardNumber = cardNumber;
	this.expiryDate = expiryDate;
	this.cvv = cvv;
}
@Override
void processPaymet() {
	System.out.println("Processing credit card payment.");
	
}
@Override
void validateTransaction() {
	System.out.println("Validating card number, expiry, and CVV.");
	
}
public void generateTransactionId() {
	System.out.println("Generated transaction ID: 123456789");
}
}
class UPIPayment extends payment{

public String upiId;
public String phoneNumber;
public UPIPayment(String upiId, String phoneNumber) {
	super();
	this.upiId = upiId;
	this.phoneNumber = phoneNumber;
}
@Override
void processPaymet() {
	System.out.println("Processing UPI payment.");
	
}
@Override
void validateTransaction() {
	System.out.println("Validating UPI ID and phone number.");
	
}
public void generateTransactionId() {
	System.out.println("Generated transaction ID: 987654321");
}
}
 class PayPalPayment extends payment {

String email;
String authToken;
public PayPalPayment(String email, String authToken) {
	super();
	this.email = email;
	this.authToken = authToken;
}
@Override
void processPaymet() {
	
	System.out.println("Processing PayPal payment.");
}
@Override
void validateTransaction() {
	
	System.out.println("Validating email and authentication token.");
}
public void generateTransactionId() {
	System.out.println("Generated transaction ID: 543216789");
}
 }
public class PaymentProcessingSystem {

	public static void main(String[] args) {
		payment pay;
		pay =new CreditCardPayment("1234567890123456", "12/25", "123");
 pay.processPaymet();
 pay.validateTransaction();
 pay.generateTransactionId();
 pay=new  UPIPayment("user@upi", "1234567890");
 pay.processPaymet();
 pay.validateTransaction();
 pay.generateTransactionId();
 pay=new  PayPalPayment("user@example.com", "abc123");
 pay.processPaymet();
 pay.validateTransaction();
 pay.generateTransactionId();
	}

}
