package com.companies.salesforce.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNumberTest {

	@Test
	public void test1() {
		int[] arr = {1,2,3,4,5};
		int k = 1;
		String result= FindNumber.findNumber(arr, k);
		assertEquals("YES", result);
	}
	
	@Test
	public void test2() {
		
		int[] arr = {2,3,1};
		int k = 5;
		String result= FindNumber.findNumber(arr, k);
		assertEquals("NO", result);
	}

}
