package com.generic;
import java.lang.*;

public class Rectangle extends Object {
	int length = 10;
	int breath;
	//static int summa;

	/* the below is called constructor which has same name as class name and there is no return type. */
	public Rectangle() {
		//public Object() {}
		super();//by default the java calls the parent/super constructor
		System.out.println("object constructed");
	}
	
	public static void main(String[] args) {
		
		Rectangle rect2 = Rectangle.createObject(10, 6);
		
		/*Rectangle rect = new Rectangle();// the "new keyword with the Class" first always call the respective class' Constructor 
		rect.length = 10;
		rect.breath = 6;*/
				
		int length = 1;
		System.out.println(length);//prints 1
		
		int rectArea1 = rect2.calculateArea();
		System.out.println("My Rect1 area: " + rect2.calculateArea());
		
		Rectangle rect1 = Rectangle.createObject(4, 5);
		/*rect = new Rectangle();
		rect.length = 4;
		rect.breath = 5;*/

		
		int rectArea2 = rect1.calculateArea();
		System.out.println("Rect2 area: " + rectArea2);
	}
	
	public static int calculateArea(Rectangle rect) {
		return rect.calculateArea();
	}
	
	public String appendTwoStrings(String strOne, String strTwo) {
		String appendedString = strOne+strTwo;
		System.out.println(length);//prints 10
		return appendedString;
	}
	
	public int calculateArea() {
		int area = length * breath;
		return area;
	}
	
	public int calculateArea(int multiply) {
		return (length * multiply) + (breath * multiply);
	}
	
	public String toString() {
		return "breath: " +  breath + " , length: " + length;
	}
	
	public static Rectangle createObject(int argLengh, int argBreath) {
		
		Rectangle rect = new Rectangle();
		System.out.println(rect.toString());
		//rect.hashCode();
		rect.length = argLengh;
		rect.breath = argBreath;
		return rect;
	}
	
}