package com.iec.test;

import java.util.Arrays;

/**
 * 插入排序学习
 * @author dengjunfeng
 *
 * 2020年1月9日-下午10:50:10
 */
public class InsertSort {
	
	public static void main(String[] args) {
		
		int[] arrs = {20,54,69,32,45,66,88,90,12,21,55,33};
		
		int len = arrs.length;
		int current; //当前需要比较的值
		for (int i = 0; i < len-1; i++) {
			current = arrs[i+1];
			int preIndex = i;
			while(preIndex>=0&&current<arrs[preIndex]) {
				arrs[preIndex+1] = arrs[preIndex];
				preIndex--;
			}
			arrs[preIndex+1] = current;
		}
		System.out.println(Arrays.toString(arrs));
	}
	
	
	
	
	
	
	
	
	
	
	
}
