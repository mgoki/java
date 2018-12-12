package com.generic;
public class Solution {
	public static String outstring ="dfdfdfd";
	//Solution.main("7.6","6", "huhjk", "kjkjh");
 public static void main(String[] a) {
   System.out.println(addnumber(3,5));
   System.out.println(3+5);
   String b = "10";
   System.out.println(a[0] + a[1]);
   System.out.println(Solution.outstring);
   
   System.out.println(addnumber(Integer.valueOf(a[2]),Integer.valueOf(a[3])));
   Integer intObject = new Integer(5);
   System.out.println(intObject.toString());
   System.out.println(multiplynumber(3,5));
    }
	
	private static int addnumber(int num1,int num2){
		int result=num1+num2;
		return result;
	}
	
	static int multiplynumber(int num1,int num2){
		int result=num1*num2;
		return result;
	}
	
	void printMyName() {
		int i = 25590;
		String s = "M";
		String myName = "Gokila";
		System.out.println(myName);
	}
	
  }
