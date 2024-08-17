package com.bikkadit.FirstApplication.math;

public class EvenOdd {
	
	public boolean evenOddNumber(int number) {
		
		if (number % 2 == 0) {
            System.out.println(number + " is even.");
            return true;
        } else {
            System.out.println(number + " is odd.");
            return false;
        }
		
	}
	
	public void developMethod() {
		System.out.println("develop method");
	}

}
