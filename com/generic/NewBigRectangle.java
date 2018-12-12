package com.generic;
public class NewBigRectangle extends BigRectangle {

	public NewBigRectangle() {
	}
	public static void main(String[] args) {
		NewBigRectangle nbRectangle = new NewBigRectangle();
		nbRectangle.setvalue(3,4,5);
		nbRectangle.setLength1(3);
		nbRectangle.setLength2(4);
		System.out.println("The NewBigRectangle area size: " + nbRectangle.getComputedArea());
		nbRectangle.setvalue(6,3,7);
		System.out.println("The NewBigRectangle area size: " + nbRectangle.getComputedArea());
		
		Rectangle abcd = Rectangle.createObject(5, 6);
		System.out.println("my abcd area:"+ abcd.calculateArea());
		Rectangle.calculateArea(abcd);
		
		System.out.println("My new Rectangle size is: " + Rectangle.createObject(6, 6).calculateArea());
	}
}
