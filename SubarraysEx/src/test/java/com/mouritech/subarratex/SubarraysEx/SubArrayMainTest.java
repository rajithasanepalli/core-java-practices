package com.mouritech.subarratex.SubarraysEx;




import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayMainTest {

	@Test
	public void testSubArrayMain() {
		int a[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int []b=Arrays.copyOfRange(a, 3, 8);
		Assert.assertArrayEquals(new int [] {30,25,40,32,31} ,b); 
		
		
		
	}



	

	

}
