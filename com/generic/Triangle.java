package com.generic;
public class Triangle {
	int base;
	int side1;
	int side2;
	
	public static void main(String[] args) {
		Triangle size = createObject (4,4,4);
		
		
    int sizeArea = size.calculateArea();
		System.out.println("My size area: " + sizeArea);
	
	}

	public int calculateArea() {
		int area = base * side1 * side2;
		return area;
	}
	
	public static Triangle createObject(int base,int side1,int side2) {
		Triangle size = new Triangle();
		size.base = base;
		size.side1 = side1;
		size.side2 = side2;
		return size;
	}
}