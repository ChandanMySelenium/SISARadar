package login_module;

import org.testng.annotations.Test;

import generic.baseTest;
import pages.initializesPages;

public class login_script extends baseTest {

	@Test
	public void loginScript() {
		initializesPages pages = new initializesPages(driver);
		pages.login.setUserName("chandan");
		pages.login.setPassword("chandan@123");
		pages.login.clickOnLoginBtn();
		pages.login.clickOnOkBtn();
	}
}
