package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page {

	WebDriver driver;
	@FindBy(id = "usernameOrEmailAddress")
	private WebElement tbUserName; 
	
	@FindBy(id = "pass")
	private WebElement tbPassword;
	
	@FindBy(id = "LoginButton")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	private WebElement btnOk;
	
	public login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	public void setUserName(String str) {
		this.tbUserName.sendKeys(str);
	}
	
	public void setPassword(String str) {
		this.tbPassword.sendKeys(str);
	}
	
	public void clickOnLoginBtn() {
		this.btnLogin.click();
	}
	
	public void clickOnOkBtn() {
		wait.until(ExpectedConditions.visibilityOf(btnOk));
		this.btnOk.click();
	}
}
