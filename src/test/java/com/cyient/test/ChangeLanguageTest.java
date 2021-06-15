package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ChangeLanguageTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    

	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	   // Set your access credentials
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
	       
	        
	        //Accept all
	        driver.findElement(By.id("com.trivago:id/activityCookieConsentContentAcceptButton")).click();
	        
	        Thread.sleep(2000);
	        //click on setting
	        driver.findElement(By.id("com.trivago:id/action_settings")).click();
	        
	        //click on language
	        driver.findElement(By.id("com.trivago:id/fragmentSettingsLanguageTitleTextView")).click();
	        
	        //scroll and select Italian 
	        String visibleText = "Italian";
		       
	        driver.findElementByAndroidUIAutomator
	        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
	        
	        //click on confirm and restart
	        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
	        Thread.sleep(2000);
	        
	       
	      driver.quit();
	        
	        
	        
	        
	        
	        
	        
	        
	        
}
}
