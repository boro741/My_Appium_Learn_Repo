package appium_learn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDriver {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "testPixel");
		
		// Invoke Chrome Browser
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		// cap.setCapability(MobileCapabilityType.NO_RESET, true);
		// If noReset is set to TRUE, the app data will NOT be cleared before this session starts.
		// If fullReset is set to true, the app will get uninstalled and all data will be cleared.
		cap.setCapability("chromedriverExecutable", "/Users/qatest/node_modules/appium/node_modules/appium-chromedriver/chromedriver/mac/chromedriver");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		return driver;
	}
}
