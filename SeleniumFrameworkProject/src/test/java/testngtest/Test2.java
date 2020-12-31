package testngtest;

import org.testng.annotations.Test;
import com.yesm.businessfunctions.BaseUtil;
import com.yesm.businessfunctions.CommonBusinessUtils;
import com.yesm.configuration.Prop;

public class Test2 extends BaseUtil {
	
	@Test(groups= {"smoke"})
	
	public void loginlogout() {
		
		BaseUtil.openApp();
		CommonBusinessUtils.login(Prop.get("username"), Prop.get("password"));
		CommonBusinessUtils.logout();
		
		driver.close();
		driver.quit();
	}

}
