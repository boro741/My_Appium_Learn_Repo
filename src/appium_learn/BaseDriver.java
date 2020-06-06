package appium_learn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseDriver {
	public static IOSDriver<IOSElement> Capabilities() throws MalformedURLException {
		File f = new File("//Users/qatest//Library//Developer//Xcode//DerivedData//UICatalog-dwlkcbkzqblmkadwkjbwtnaryqsg//Build//Products//Debug-iphonesimulator");
		File fs = new File(f,"UICatalog.app");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}
}
