package com.yesm.pagerepository;

import org.openqa.selenium.By;
import com.yesm.businessfunctions.BaseUtil;

public class LoginPage extends BaseUtil{
	
	
	 public static By txtUserName=By.xpath("//*[@id=\"txtUsername\"]");
	 public static By txtPassword=By.xpath("//*[@id=\"txtPassword\"]");
	 public static By btnSubmit=By.name("Submit");
	 
	 public static void enterUserName(String username) {		 
		 driver.findElement(txtUserName).sendKeys(username); 
		 
	 }
	 
	 public static void enterPassword(String password) {		 
		 driver.findElement(txtPassword).sendKeys(password);
	 }
	 
	 public static void clickSubmit() {		 
		 driver.findElement(btnSubmit).click();
	 }

}
