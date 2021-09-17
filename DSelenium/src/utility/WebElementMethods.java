package utility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementMethods {
	
	public static void enterText(WebDriver driver, By locator, String text)
	{
		try
		{
			driver.findElement(locator).sendKeys(text);
		}
		catch(NoSuchElementException e)
		{
		System.out.println("Element not found"+e.getMessage() );
		}
	
	}
	public static void clickElement(WebDriver driver, By locator)
	{
		//try
		{
			driver.findElement(locator).click();
		}
		//catch()
		{
			
		}
	}

}
