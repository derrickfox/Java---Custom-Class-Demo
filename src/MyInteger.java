/* Derrick Fox
 * CS 213 31015
 * MyInteger.java
 * Homework 10
 * April 1, 2014
 * 
 * MyInteger is a class with methods to check if an integer is odd, even,
 * prime, or equal to another integer.
 */
public class MyInteger {
// Instance Variables 
	int value = 0;
	
// Constructors 
	MyInteger() {
		value = 0;
	}
	
	MyInteger(int number) {
		value = number;
	}
	
// Get Method 
	public void getInt() {
		System.out.println(value);
	}
	
// Set Method 
	public void setInt(int number) {
		value = number;
	}
	
// Methods to determine if integer is odd, even, or prime with no parameters 
	public boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
	
	public boolean isOdd() {
		if(!(value % 2 == 0)) {
			return true;
		}
		else 
			return false;
	}
	
	public boolean isPrime() {
	    for(int i = 2; i < value; i++) {
	        if(value % i == 0)
	            return false;
	    }
	    return true;
	}
	
// Methods to determine if integer is odd, even, or prime with integer parameters
	static public boolean isEven(int number) {
		if(number % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
	
	static public boolean isOdd(int number) {
		if(!(number % 2 == 0)) {
			return true;
		}
		else 
			return false;
	}
	
	static public boolean isPrime(int number) {
	    for(int i = 2; i < number; i++) {
	        if(number % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public boolean equals(int number) { 
		if(number == value) {
			return true;
		}
		else
			return false;
	}
	
// Methods to determine if integer is odd, even, or prime with MyInteger type parameters.
	static public boolean isEven(MyInteger number) {
		if(number.value % 2 == 0) {
			return true;
		}
		else 
			return false;
	}
	
	static public boolean isOdd(MyInteger number) {
		if(!(number.value % 2 == 0)) {
			return true;
		}
		else 
			return false;
	}
	
	static public boolean isPrime(MyInteger number) {
	    for(int i = 2; i < number.value; i++) {
	        if(number.value % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public boolean equals(MyInteger number) { 
		if(number.value == value) {
			return true;
		}
		else
			return false;
	}
	
// Parsing Methods
	public static int parseInt(char[] array) {
		String message = new String(array);
		return Integer.parseInt(message);
	}
	
	public static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}
