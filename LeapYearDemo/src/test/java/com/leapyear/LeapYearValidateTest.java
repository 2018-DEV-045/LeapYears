package com.leapyear;

import static org.junit.Assert.*;


import org.junit.Test;

import com.leapyear.LeapYearValidate;


public class LeapYearValidateTest {

	  

    @Test
    public void testLeapYear() {
        
    	assertTrue(LeapYearValidate.isCheckLeapYear(2008));
    }
		
    @Test
    public void testNotLeapYear() {
        
    	assertFalse(LeapYearValidate.isCheckLeapYear(1700));
    }
	
}
