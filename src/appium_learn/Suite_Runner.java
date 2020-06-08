package appium_learn;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class Suite_Runner extends BaseDriver {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		
		HomePage h = new HomePage(driver);
		
		h.Preferences.click();
	}

}
