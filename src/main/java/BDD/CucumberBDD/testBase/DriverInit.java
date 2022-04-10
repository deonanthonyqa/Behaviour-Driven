package BDD.CucumberBDD.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import BDD.CucumberBDD.Utils.ReadConfigDetails;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInit {

	private static WebDriver driver;
	public static String browserType = null;
	public static String configPath = null;
	public ReadConfigDetails configDtls = new ReadConfigDetails();
	public static String appURL = null;


	

	@Before
	public void before_or_after_all() {
		System.out.println("Initialized Driver");
		try {
			// Reading the Config details info with object reference
		
			//browserType = configDtls.getBrowser();
			appURL = configDtls.getPropertyValue("url");
		} catch (Exception e) {
			// logger.error("Error in initializeSuite Method: ", e.getMessage());
			System.out.println(e.getMessage());
		}
		try {
			String browser = configDtls.getPropertyValue("browser");
			System.out.println(browser+"It is browser");
			switch (browser.toLowerCase()) {
			case "chrome":
				initChromeDriver(appURL);
				break;
			case "firefox":
				initFirefoxDriver(appURL);
				break;
			case "ie":
				initIEDriver(appURL);
				break;

		}
			
			
			
		} catch (Exception e) {
			//logger.error("Error in initDriver Method: ", e.getMessage());
			e.printStackTrace();
		}
	}
	private void initFirefoxDriver(String appURL) {
		//logger.info("Launching Google Chrome browser......");
		WebDriverManager.firefoxdriver().setup();
		setDriver(new FirefoxDriver());
		getDriver().manage().window().maximize();
		getDriver().get(appURL);
		//driver.manage().timeouts().implicitlyWait(null);
		//logger.info("Launched URL : " + appURL);
	}
	
	private void initIEDriver(String appURL) {
		//logger.info("Launching Google Chrome browser......");
		WebDriverManager.iedriver().setup();
		setDriver(new InternetExplorerDriver());
		getDriver().manage().window().maximize();
		getDriver().get(appURL);
		//driver.manage().timeouts().implicitlyWait(null);
		//logger.info("Launched URL : " + appURL);
	}
	
	private void initChromeDriver(String appURL) {
		//logger.info("Launching Google Chrome browser......");
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		//session id
		//getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().get(appURL);
		
		//driver.manage().timeouts().implicitlyWait(null);
		//logger.info("Launched URL : " + appURL);
	}
    
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverInit.driver = driver;
	}
}
