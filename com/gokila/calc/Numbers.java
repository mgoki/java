package com.gokila.calc;

import java.util.*;

import com.generic.Rectangle;

class Numbers {
	
	
	public static void main(String[] args) {
		
		int numarray[] = new int[] { 7,9,6,15,2};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(9);
		al.add(6);
		al.add(15);
		al.add(7);
//		Rectangle rect = Rectangle.createObject(3,5);
	//	al.add(rect);
		int book = 0;
		//int i = 0;
	
	/*for(int i=0;i<numarray.length;i++) {
		if(numarray[i]>book){
			book=numarray[i];
		}
		sys
	}*/
	int i =0;
    while (i < numarray.length) {
    	if(numarray[i]>book){
    		book=numarray[i];
    	}
    	i++;
    }
    
    System.out.println("my big number is: " + book);
//	Integer ii = al.get(0);
    for(Integer ii : al) {
    	System.out.println(ii);
    }
	
	}
	
	int getMeRandomNumber() {
		Random rand = new Random();
		int n = rand.nextInt(50) + 1;
		return n;
	}
}