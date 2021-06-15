package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BookHotelTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    

	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      caps.setCapability("browserstack.user", "rutwikkulkarni_Ynq1a2");
	      caps.setCapability("browserstack.key", "pXUam97pBNF7zsa5exmq");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://de377ff3eb3b5268b07751af8b7df741a9c13999");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	     	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        
	        
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	        
	        //select country
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.RadioButton")).click();
	        
	        
	       //confirm country
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.TextView[2]")).click();
	       
	        //accept policy
	        driver.findElement(By.id("com.trivago:id/activityCookieConsentContentAcceptButton")).click();
	        
	        //Tap on text
	        driver.findElement(By.id("com.trivago:id/fragmentHomeExpandedDealformDestinationTextView")).click();
	        
	        //select Goa for location
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")).click();
	        
	        //accept date
	        driver.findElement(By.id("com.trivago:id/activityDatesSelectionCalendarApplyTextView")).click();
	        Thread.sleep(3000);
	        

//	        String visibleText = "Grand Hyatt Goa";
//		       
//		        driver.findElementByAndroidUIAutomator
//	        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
//		
	        TouchAction swipe = new TouchAction(driver);
	                  swipe.press(PointOption.point(486,1527)).moveTo(PointOption.point(501,687)).release().perform();
	                  swipe.press(PointOption.point(486,1527)).moveTo(PointOption.point(501,687)).release().perform();
	                  swipe.press(PointOption.point(486,1527)).moveTo(PointOption.point(501,687)).release().perform();
	                  
	                  //Select hotel holiday in
	                  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView[1]")).click();
	                  
	                  
	                  
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	    
	      driver.quit();
	}

}
