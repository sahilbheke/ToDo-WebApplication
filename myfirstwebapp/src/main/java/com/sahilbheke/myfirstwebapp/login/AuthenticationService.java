package com.sahilbheke.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidName = username.equalsIgnoreCase("SahilBheke");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidName && isValidPassword;
	}
	
}
