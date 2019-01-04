package com.daironh.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

class SomeDataServiceStub implements SomeDataService {

	private int[] data;

	public SomeDataServiceStub(int[] data) {
		super();
		this.data = data;
	}

	@Override
	public int[] retrieveAllData() {
		return this.data;
	}

}

public class SomeBusinessTestStub {

	@Test
	public void arraySumUsingDataService_basic() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.setDataService(new SomeDataServiceStub(new int[] { 1, 2, 3 }));
		int actualResult = impl.arraySumUsingDataService();
		int expectedResult = 6;

		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void arraySumarraySumUsingDataService_oneValue() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.setDataService(new SomeDataServiceStub(new int[] { 1 }));
		int actualResult = impl.arraySumUsingDataService();
		int expectedResult = 1;

		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void arraySumarraySumUsingDataService_empty() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.setDataService(new SomeDataServiceStub(new int[] {}));
		int actualResult = impl.arraySumUsingDataService();
		int expectedResult = 0;

		assertEquals(actualResult, expectedResult);
	}

}
