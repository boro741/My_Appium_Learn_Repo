package appium_learn;

import java.net.MalformedURLException;

import ecommerce_test.EcommerceTestCases;


public class Suite_Runner{

	public static void main(String[] args) throws MalformedURLException{
		
		EcommerceTestCases ecTestCases = new EcommerceTestCases();
		
		ecTestCases.scrollToProduct();
		
	}

}
