package com.syntax.hw;

public class MoreMethod {

	String createEmail(String name, String lastName, String emailType) {
		return name+lastName+emailType;
	}
	
	
	// write a method to reurtn whether given number is prime or not?
	
	int primeOrNot(int num) {
		boolean prime = false;
		if (num>0) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					prime = true;
				}
			}
			if (!prime) {
				System.out.println(num + " is a prime number");
			}else {
				System.out.println(num + " is not a prime number");
			}
			
		}
		return num;
	}
	
	int getGrade(int score) {
		char grade;
		if (score>=90) {
			grade='A';
		}else if (score >=70 && score <=90) {
			grade='B';
		}else if (score >=50 &&  score <=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
		return score;
	}
	
	
	
	
}
