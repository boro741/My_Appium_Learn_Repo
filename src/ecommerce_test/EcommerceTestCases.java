package ecommerce_test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import appium_learn.BaseDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class EcommerceTestCases extends BaseDriver{
	AndroidDriver<AndroidElement> driver;
		public EcommerceTestCases() throws MalformedURLException{
			driver = Capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	public void fillBasicForm() {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	//  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	}
	
	public void testToastErrorMsg() throws MalformedURLException {
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		// Verify Error Toast Message
		String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name"); 
		System.out.println("Toast message: "+ toastMsg);
		// android.widget.Toast is the default class for any toast in android
		// and name is the attribute where we assign the text to toast.
		Assert.assertEquals("Please enter your name", toastMsg);
	}
	
	public void scrollToProduct() {
		this.fillBasicForm();
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))");
		 
		 int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		 
		 for(int i=0;i<count;i++){
		    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		    if(text.equalsIgnoreCase("Jordan 6 Rings")){
		    	driver.findElements(By.xpath("//android.widget.TextView[contains(@text, 'ADD TO CART')]")).get(i).click();
		    	break;
		    }
		 }
		 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	}
	
	
}
