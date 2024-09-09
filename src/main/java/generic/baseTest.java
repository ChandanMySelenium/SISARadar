package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {
	// all the constants are defined
	public static final String UserDir = System.getProperty("user.dir");

	public static final String PropertyPath = UserDir + "\\data\\SisaRadarData.properties";

	public WebDriver driver;
	public Properties data;
	
	// sets the path for driver executables
	@BeforeClass
	public void setPath() {
		try {
			FileInputStream f = new FileInputStream(PropertyPath);
			data = new Properties();
			data.load(f);
		} catch (Exception e) {
			
		}
	}

	// launches the browser
	@BeforeMethod
	public void launchBrowser() {
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(data.getProperty("url"));
	}

	// closes the browser
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
