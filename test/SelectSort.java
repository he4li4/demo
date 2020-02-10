package com.iec.test;
/**
 * 
 * @author dengjunfeng
 *
 * 2020年1月2日-下午9:37:38
 */
public class SelectSort {
	
	
	public static void main(String[] args) {
		/**
		 * 先选出最小的元素放在起始位置，再在剩余的元素中选出最小的放在已排好序序列的末尾，依次类推
		 * 思路：先假定第一个为最小，去跟其他的依次比较，碰到更小的，互换位置，依次类推
		 */
		//int[] arrs = {20,54,69,32,45,66,88,90,12,21,55,33};
		
		
		int[] arrs = {20,54,69,32,45,66,88,90,12,21,55,33};
				
		/**
		 * 20,54,69,32    总结：n个数比较了n-1轮
		 * 20,54,69,32               第m轮比了length-m次   还未比出的长度-1
		 * 	  32,69,54
		 * 		 54,69
		 * 			
		 * 
		 */
		int len= arrs.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i; j < len; j++) {
				if (arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
			
		}
		
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i]+",");
		}
		
		
		
	}
	
}
