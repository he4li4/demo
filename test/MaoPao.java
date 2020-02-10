package com.iec.test;

public class MaoPao {
	
	
	
	public static void main(String[] args) {
		
		int[] arrs = {20,54,69,32,45,66,88,90,12,21,55,33};
		/*					一轮比较还未比出来数据的length-1次
		 *							
		 *	
		 */
		for (int m = 0; m < arrs.length-1; m++) {
			for (int i = 0; i < arrs.length-m-1; i++) {
				if(arrs[i] > arrs[i+1]) {
					int temp = arrs[i];
					arrs[i] = arrs[i+1];
					arrs[i+1] = temp;
				}	
			}
		}
		
		
		for (int k = 0; k < arrs.length; k++) {
			System.out.print(arrs[k]+",");
		}
		
		
		
		
		
		
		
	}

	
}
