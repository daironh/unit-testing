package com.daironh.unittesting.business;

public class SomeBusinessImpl {

	private SomeDataService dataService;

	public int arraySum(int[] data) {
		int sum = 0;

		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		return sum;
	}

	public int arraySumUsingDataService() {
		int sum = 0;
		int[] data = dataService.retrieveAllData();
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}

		return sum;
	}

	public SomeDataService getDataService() {
		return dataService;
	}

	public void setDataService(SomeDataService dataService) {
		this.dataService = dataService;
	}
	
	
}
