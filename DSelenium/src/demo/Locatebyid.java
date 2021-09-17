package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatebyid
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\cromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		WebElement textuser =driver.findElement(By.id("login-body"));
		textuser.sendKeys("abc");
		
		driver.findElement(By.id("Stencil")).click();
		driver.close();
		
		


	}

}
