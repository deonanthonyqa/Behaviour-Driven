package BDD.CucumberBDD.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BDD.CucumberBDD.testBase.DriverInit;

public class CommonMethods {

	public void scrollToView(WebElement ele) throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor) DriverInit.getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(3000);
	}

	public void click(WebElement ele){
		ele.click();
	}
	
	public void sendKeys(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}
	
	public String getTitleofPage() {
		return DriverInit.getDriver().getTitle();
	}
}
