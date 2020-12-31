package com.yesm.businessfunctions;

import java.util.concurrent.TimeUnit;

import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;

public class CommonBusinessUtils extends BaseUtil {

	public static void login(String username, String password) {
		
		LoginPage.enterUserName(username);
		LoginPage.enterPassword(password);
		LoginPage.clickSubmit();
		
	}
	
	public static void logout() {
		
		HomePage.clickWelcome();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HomePage.clickLogout();
		
		
	}

}
