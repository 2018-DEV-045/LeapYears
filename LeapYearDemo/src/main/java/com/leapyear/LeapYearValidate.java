package com.leapyear;

import java.util.Scanner;

public class LeapYearValidate {

	public static void main(String[] args) {
			
		    Scanner in = new Scanner(System.in);
	        System.out.print("Input the year: ");
	        int year = in.nextInt();
	        boolean leapYear=false;
	        if(year>0 &&  String.valueOf(year).length()==4){
	        	leapYear=isCheckLeapYear(year);
	        	if(leapYear){
	        		System.out.println("Leap Year :"+year);
	        	}else{
	        		System.out.println("Not Leap Year :"+year);
	        	}
	        }else{
	        	System.out.println("Please enter valid Year");
	        }
	   
	}
	
    public static boolean isCheckLeapYear(int year){
    	    
    	    boolean leapyearFlag=false;
    	    boolean x = (year % 4) == 0;
	        boolean y = (year % 100) != 0;
	        boolean z = ((year % 100 == 0) && (year % 400 == 0));

	        if (x && (y || z)){
	       	   leapyearFlag=true;
	        }
	        	 
    	  return leapyearFlag;
     }
	
	

}
