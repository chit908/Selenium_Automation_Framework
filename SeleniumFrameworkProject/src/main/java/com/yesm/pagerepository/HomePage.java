package com.yesm.pagerepository;

import org.openqa.selenium.By;
import com.yesm.businessfunctions.BaseUtil;

public class HomePage extends BaseUtil {
	
	public static By welcome=By.id("welcome");
	public static By logout=By.linkText("Logout");
	
	public static void clickWelcome() {
		
		driver.findElement(welcome).click();
	}
	
	public static void clickLogout() {
		
		driver.findElement(logout).click();
	}

}
