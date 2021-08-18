package com.syntax.hw;

public class HwForMethodsTester {

	public static void main(String[] args) {
// Task 1		
		HwForMethods method = new HwForMethods();
		
		method.numbers(12, 4);
// Task 2	
		HwForMethods numbs = new HwForMethods();
		
		numbs.numbers(15);
		
// Task 3 		
		HwForMethods taskThree = new HwForMethods();
		
		taskThree.palindrome("racecar");
		
// Task 4
		HwForMethods taskFour = new HwForMethods();
		String country = taskFour.hello("Spanish");
		System.out.println(country);
	}

}
