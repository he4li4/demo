package com.iec.test;

import org.junit.jupiter.api.Test;

public class LeetCode {
	
	
	
	@Test
	public void testName() {
		/**
		 * 1    1
		 * 2    11   2
		 * 3    111  12  21
		 * 4    1111  22 121 112 211
		 * 5    11111 221 212 122 1112 1121 1211 2111
		 * 
		 * f(n+2) = f(n+1)+f(n);   n>=1  f(1) = 1; 
		 */
		
		int n = 40 ;
		long start = System.currentTimeMillis();
		int result = test(n);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(result);
		
	}

	private int test(int n) {
		
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		
		return test(n-1)+test(n-2);
	}
	
	
	@Test
	public void testName2() {
		
		System.out.println(2>>3);
		
	}

	
}
