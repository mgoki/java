package com.generic;
public class BigRectangle {
	private int breath;
	private int length1;
	private int length2;
	
	/* the below is called constructor which has same name as class name and there is no return type. */
	/* no arguments constructor*/
	public BigRectangle() {
		super();
		
	}
	
	/* the below is argument constructor */
	public BigRectangle(int breath, int length1, int length2) {
		this.breath = breath;
		this.length1 = length1;
		this.length2 = length2;
	}
	
	public BigRectangle(String str, int breath, int length1) {
	}
	
	public int getComputedArea() {
		int calcv =  (this.breath * this.length1) + (this.breath * this.length2);
		return calcv;
	}
	
	public int getBreath() {
		return breath;
	}
	
	public void setBreath(int breath) {
		this.breath = breath;
		return;
	}
	
	/*public void setBreath(int breath, int length) {
		this.breath = breath;
		this.length1 = length;
	}*/
	public void setvalue(int breath,int length1,int length2) {
		this.breath = breath;
		this.length1 = length1;
		this.length2 = length2;
	}	
	
	public int getLength1() {
		return length1;
	}
	
	public void setLength1(int length1) {
		this.length1 = length1;
	}

	public int getLength2() {
		return length2;
	}
	
	public void setLength2(int length2) {
		this.length2 = length2;
	}
	
}

