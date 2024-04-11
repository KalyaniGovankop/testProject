package seleniumPgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\120CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.name("country"));
		Select drpCountry = new Select(e);
		
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);
		drpCountry.selectByValue("MACAU");
		Thread.sleep(3000);
		drpCountry.selectByIndex(0);
		Thread.sleep(3000);
		
		drpCountry.getAllSelectedOptions();
		
	
		System.out.println("Test Complete");
		driver.quit();
	}

}
