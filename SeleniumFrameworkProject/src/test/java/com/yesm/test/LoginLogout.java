package com.yesm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.businessfunctions.BaseUtil;
import com.yesm.businessfunctions.CommonBusinessUtils;
import com.yesm.configuration.Prop;
import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;
import com.yesm.utilityfunction.ExcelUtil;

public class LoginLogout extends BaseUtil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chitra\\eclipse-workspace\\AutomationFramework\\SeleniumFrameworkProject\\Driver\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.id("txtUsername")).sendKeys(Prop.get("username"));
		//driver.findElement(By.id("txtPassword")).sendKeys(Prop.get("password"));
		//driver.findElement(By.name("Submit")).click();
		int rowcount=ExcelUtil.getRowCount();
		int colcount=ExcelUtil.getColumnCount();
		
		for (int i=1;i<=rowcount;i++) {
		BaseUtil.openApp();
		CommonBusinessUtils.login(ExcelUtil.getData(i,0), ExcelUtil.getData(i, 1));
		CommonBusinessUtils.logout();
		driver.quit();
		driver.close();
		}
		
		//LoginPage.enterUserName(Prop.get("username"));
		//LoginPage.enterPassword(Prop.get("password"));
		//LoginPage.clickSubmit();
		
		//driver.findElement(By.id("welcome")).click();
		
		//driver.findElement(By.linkText("Logout")).click();
		
		//HomePage.clickWelcome();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//HomePage.clickLogout();
		
		//driver.close();
		//driver.quit();
		
		
		

	}
	}

