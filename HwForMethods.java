package com.syntax.hw;

public class HwForMethods {

	// Create a method that will take 2 parameters
	// as a numbers and prints which number is larger.

	void numbers(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

	// Create a method that will take a number and prints whether the number is even
	// or odd

	void numbers(int number1) {
		if (number1 % 2 == 0) {
			System.out.println(number1 + " is a even number");
		} else {
			System.out.println(number1 + " is a odd number");
		}
	}

	// Create a method that will print whether a given string is palindrome or not.

	String palindrome(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse += str.charAt(i);

		}
		if (str.equals(reverse)) {
			System.out.println("is palindrone " + true);
		} else {
			System.out.println("is palindrone " + false);
		}

		return reverse;

	}

	// create a method that will say Hello in different language based on the country that will passed when method is executed
	
	String hello(String language) {
		String hello=null;
		switch(language) {
		case "English":
			hello="Hello";
			break;
		case "Spanish":
			hello="Hola";
			break;
		case "French":
			hello="Bonjour";
			break;
		}
		return hello;
	}
	
}
