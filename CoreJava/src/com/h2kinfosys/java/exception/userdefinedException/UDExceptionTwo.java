package com.h2kinfosys.java.exception.userdefinedException;

public class UDExceptionTwo {

	public static void main(String[] args) {
		UDExceptionExample udee = new UDExceptionExample();
		
		try {
			udee.doCalculation(2, 3);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}
		
		
		udee.doCalculation(1, 3);
	}
}