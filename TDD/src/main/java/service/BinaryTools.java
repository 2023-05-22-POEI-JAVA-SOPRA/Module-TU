package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryTools {

	public String add(String s1, String s2) {
		
	    if (!Pattern.matches("[01]*", s1) || !Pattern.matches("[01]*", s2)) {
	    	throw new IllegalArgumentException("Args are not binary strings");
	    }
	    
		int n1 = toInteger(s1);
		int n2 = toInteger(s2);
		
		int resultInteger = n1 + n2;
		
		return toBinary(resultInteger);
	}
	
	
	public int toInteger(String binary) {
		StringBuilder reverse = new StringBuilder();
		reverse.append(binary);
		reverse.reverse();
		String reversed = reverse.toString();
		
		int result = 0;
		
		for (int i = 0; i< reversed.length(); i ++) {
			if (reversed.charAt(i) == '1') {
				result += Math.pow(2, i);
			}
		}
		return result;
	}
	
	public String toBinary(int number) {
		
		if (number < 0) {
			return null;
		}
		
		
		String result = "";
		while (number > 0) {
			result = number%2 + result;
			number = number/2;
		}
		
		return result;
	}
	
}
