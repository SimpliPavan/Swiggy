package com.mobileautomation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstTestCase {

	public AndroidDriver<AndroidElement> driver;
	public String destDir;
	public DateFormat dateformat;

	@Test

	public void openDevice() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appium:deviceName", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion", "9.0");
		caps.setCapability("noRest", "true");

		caps.setCapability("appPackage","in.swiggy.android");
		caps.setCapability("appActivity","in.swiggy.android.activities.HomeActivity");

		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("android.widget.TextView[@text='EXPLORE SWIGGY']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.TextView[@text='SET DELIVERY LOCATION']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//android.widget.Button[@text='Deny']")).click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='CONTINUE AS GUEST']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='DENY']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search for area, street name…']")).sendKeys("Hyderabad");
		//driver.findElement(By.id("in.swiggy.android:id/location_description")).sendKeys("Hyderabad");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("android.widget.TextView[@text='CONFIRM LOCATION']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text")).click();   
		driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabad']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//android.widget.Button[@text='Deny']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM LOCATION']")).click();
		//driver.findElement(By.id("in.swiggy.android:id/google_place_search_title_text1")).click();
		
		/*driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT &PROCEED']")).click();
		Thread.sleep(2000);
		driver.hideKeyboard();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabad']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Search for restaurant, item or more']")).sendKeys("pizza");
		//driver.findElementById("in.swiggy.android:id/tv_search_dls").click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Pizza\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("in.swiggy.android:id/quantity_text_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Add Item to Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("in.swiggy.android:id/checkoutText")).click();
	}
}
