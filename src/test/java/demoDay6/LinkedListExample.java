package demoDay6;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class LinkedListExample {
	
	@Test
	public void verifyList() {
		
		PrintData<Integer> data = new PrintData<>();
		
		data.value = 6543275;
		
		data.printData();
		
		
		PrintData<String> strData = new PrintData<>();
		
		strData.value = "Saurabh";
		
		strData.printData();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		
	}

}
