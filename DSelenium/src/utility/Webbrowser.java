package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowser {

	public static WebDriver openBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\cromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	public static void vertifyTitle(WebDriver driver, String expTitle)
	{
		if (driver.getTitle().equals(expTitle))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

	public static void titleCotains(WebDriver driver ,String expTitle)
	{
		if (driver.getTitle().contains(expTitle))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}





}
}
