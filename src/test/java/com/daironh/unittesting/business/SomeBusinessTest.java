package com.daironh.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void arraySumBasic() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int actualResult = impl.arraySum(new int[]{1,2,3});
		int expectedResult = 6;
		
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void arraySumOneValue() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int actualResult = impl.arraySum(new int[]{1});
		int expectedResult = 1;
		
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void arraySumEmpty() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int actualResult = impl.arraySum(new int[]{});
		int expectedResult = 0;
		
		assertEquals(actualResult, expectedResult);
	}

}
