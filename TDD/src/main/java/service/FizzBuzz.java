package service;

public class FizzBuzz {
	
	/*
		Si le nombre est divisible par 3 -> Fizz
		Si le nombre est divisible par 5 -> Buzz
		Si le nombre est divisible par 3 et 5 -> FizzBuzz
		Sinon le nombre
	 */
	public String play(int number) {
		
		if (number%15 == 0) {
			return "fizzbuzz";
		}
		if (number%3 == 0) {
			return "fizz";
		}
		if (number%5 == 0) {
			return "buzz";
		}
		
		return  String.valueOf( number);
	}
	
	public String addBinary(String a, String b) {
		
		for (int i =0; i < Math.max(a.length(), b.length()); i++) {
			
		}
		
		
		
		return null;
	}
}
