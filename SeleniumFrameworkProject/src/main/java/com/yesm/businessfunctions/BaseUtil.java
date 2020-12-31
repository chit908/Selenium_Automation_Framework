package com.yesm.businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.configuration.Prop;

public class BaseUtil {
	
	public static WebDriver driver=null;
	
	public static void openApp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chitra\\eclipse-workspace\\AutomationFramework\\SeleniumFrameworkProject\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Prop.get("url"));

}
}
