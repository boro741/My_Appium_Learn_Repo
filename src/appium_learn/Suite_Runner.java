package appium_learn;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Suite_Runner extends BaseDriver {

	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement> driver = Capabilities();
	}

}
