package com.test.introduction;

import org.testng.annotations.DataProvider;

public class DataProviderAdactin {

	@DataProvider(name = "data1")
	public Object[][] getData() {
		return new Object[][] { { "nimmi9311", "123456789" } };

	}

	@DataProvider(name = "data2")
	public Object[][] getData2() {
		return new Object[][] {{ "London", "Hotel Creek", "Double", "2-Two", "16/08/2022", "17/08/2022", "1-One","2-Two"} };
	}
	@DataProvider(name="data3")
    public Object[][] getdata3() {
		return new Object [][] {{"nimmi","Praveen","sivagangai ","6543 2178 6324 8976",
			"AirIndian Express","December","2022","007"}};
}
}