package com.mouritech.sumofarrays;

public class SumOfArrays {
	int a[]= {34,56,78};
	int b[]= {43,65,50};
	int c[]=new int[a.length];
	void sumOfTwoarryas() {
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
			System.out.print("\t"+c[i]);
			
		}
	}
}
	




	
	


