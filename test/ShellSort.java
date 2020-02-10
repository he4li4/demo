package com.iec.test;

import java.util.Arrays;

/**
 * 希尔排序
 * @author dengjunfeng
 *
 * 2020年1月11日-上午10:29:15
 */
public class ShellSort {
	public static void main(String[] args) {
		int[] arrs = {20,54,69,32,45,66,88,90,12,21,55,33};
		int[] result = shellSort(arrs);
		System.out.println(Arrays.toString(result));
		
	}

	
	
	private static int[] shellSort(int[] arrs) {
		int len = arrs.length;
		int grap = len/2;
		int current;
		while(grap>0) {
			for (int i = grap; i < len; i++) {
				int preIndex = i-grap;
				current = arrs[i];
				while(preIndex>=0&&arrs[preIndex]>current) {
					arrs[preIndex+grap] = arrs[preIndex];
					preIndex=preIndex-grap;
				}
				arrs[preIndex+grap] = current;
			}
			grap /=2;
		}
		return arrs;
	}
}
