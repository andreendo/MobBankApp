package com.github.MobBankApp.client.util;

public class Validator {

	public static boolean isValidName(String name) {
		if(name == null)
			return false;
		
		return name.matches( "[a-zA-Z]+( [a-zA-Z]+)+" );
	}
	
	public static boolean isValidFloatValue(String data) {
		if(data == null)
			return false;
		
		try {
			double value = Double.parseDouble(data);
			return value > 0;
		}catch (Exception e) {
		}
		return false;
	}
	
}
