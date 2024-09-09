package pages;

import org.openqa.selenium.WebDriver;

public class initializesPages {

	public login_page login;
	
	public initializesPages(WebDriver driver) {
		this.login = new login_page(driver);
	}
}
