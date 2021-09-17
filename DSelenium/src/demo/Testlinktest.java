	package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlinktest 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\cromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Images")).click();
		if(driver.getTitle().equals("Google Images"));
		{
			System.out.println("Pass");
		}
		String acttitle =driver.getTitle();
		if( acttitle.equals("GoogleImages"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
			
		}
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElement(By.partialLinkText("Advert")).click();
		
		
		driver.close();

	}

}
