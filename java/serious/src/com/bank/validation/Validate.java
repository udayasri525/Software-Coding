package com.bank.validation;
import com.bank.customers.*;
public class Validate {
	
public static void main(String[] args)
{
	long phoneNumber=1234567893;
	   long temp=phoneNumber;
       long rev = 0;

       while (temp > 0) {
           long digit = temp % 10;      // last digit
           rev = rev * 10 + digit;      // add to reverse
           temp = temp / 10;            // remove last digit
       }

  for(int i=0;i<6;i++)
  {
	   rev=rev/10;
  }

	System.out.println( "xxxxxx"+rev);
   }
}
	
