package com.aakash.service;

import java.security.SecureRandom;
import java.util.Random;

public class CredentialService {
	
	public String password;
	public String emailAddress;
		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public void generatePassword()
	{
		final String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		final String numbers = "0123456789";
		final String specialChar = "@!#$%^&*()?/><";
		 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 3; i++)
        {
            int randomIndex = random.nextInt(capLetter.length());
            sb.append(capLetter.charAt(randomIndex));
        }
        
        for (int i = 0; i < 3; i++)
        {
            int randomIndex = random.nextInt(smallLetter.length());
            sb.append(smallLetter.charAt(randomIndex));
        }
        for (int i = 0; i < 1; i++)
        {
            int randomIndex = random.nextInt(specialChar.length());
            sb.append(specialChar.charAt(randomIndex));
        }
        
        
        for (int i = 0; i < 3; i++)
        {
            int randomIndex = random.nextInt(numbers.length());
            sb.append(numbers.charAt(randomIndex));
        }
        
        password = sb.toString();
	}
	
	public void generateEmailAddress(String firstName,String lastName,String department)
	{
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		
		emailAddress=firstName+lastName+"@"+department+".cognizant.com";
	}
	//generateEmailAddress, & showCredentials
	
	public void showCredentials()
	{
		System.out.println("Email - > "+emailAddress );
		System.out.println("Password - > "+password);
	}

}
