package com.generic;
public class ReferenceObjects {

	String myName;
	int count;
	float values;
	
	public static void main(String[] args) {
		BigRectangle bigRectNoArg = new BigRectangle();
		bigRectNoArg.setBreath(2);
		
		BigRectangle bigRectWithArg = new BigRectangle(4, 2, 3);
	}
	
}