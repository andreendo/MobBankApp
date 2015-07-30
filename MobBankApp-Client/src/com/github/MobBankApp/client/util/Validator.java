package com.github.MobBankApp.client.util;

public class Validator {

	public static boolean isValidName(String name) {
		if(name == null)
			return false;
		
		return name.matches( "[a-zA-Z]+( [a-zA-Z]+)+" );
	}
	
}
