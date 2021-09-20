package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("aaa");
		}

	}
	
	public static void openCalculator() throws Exception{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SM-A715W");
		cap.setCapability("udid", "R58N90KRMWJ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		//cap.setCapability("appPackage", "com.meesho.supply");
		//cap.setCapability("appActivity", "com.meesho.supply.main.MainActivity"); 
		
		//URL url= new URL("http://127.0.0.1:4723/wd/hub");
		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		// 0.0.0.0:4723
		driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started...");
		
		MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		two.click();
		
		MobileElement multiply = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
		multiply.click();
		
		MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		five.click();
		
		
	
		
		
		
		
	}

}
