package com.mouritechquick.MovieMavenProject;



import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class SumOfArraysTest {

	@Test
	public void testSumOfTwoarrays() {
		
		SumOfArrays s=new SumOfArrays();
	
		Assert.assertArrayEquals(new int[] {77,121,128},s.sumOfTwoarryas());
				
	}

}
