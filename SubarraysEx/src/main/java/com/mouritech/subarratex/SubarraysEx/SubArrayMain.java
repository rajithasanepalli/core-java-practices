package com.mouritech.subarratex.SubarraysEx;

import java.util.Arrays;

public class SubArrayMain {

	public static void main(String[] args) {
		int a[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		
		for(int i=0;i<=10;i++) {
			System.out.print(""+a[i]+",");
		}
		System.out.println("\n");
		int []b=Arrays.copyOfRange(a, 3, 8);
		System.out.println(Arrays.toString(b));

	}

}
