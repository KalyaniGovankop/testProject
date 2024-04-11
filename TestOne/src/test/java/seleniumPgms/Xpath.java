package seleniumPgms;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\120CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Declare and initialise a fluent wait
		FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		wait.pollingEvery(5, TimeUnit.SECONDS);
		
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		//Sepcify polling time
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
	//	wait.ignoring(NoSuchElementException.class)


		WebElement wb = driver.findElement((By.xpath("//*[contains(text(),'Alfreds Futterkiste')]//following::td[1]")));
        System.out.println(wb.getText());

	
		WebElement wb1 = driver.findElement(By.xpath("//*[contains(text(),'Helen Bennett')]//preceding::td[1]"));
		System.out.println(wb1.getText());
		
		System.out.println("Test complete");
		driver.quit();
		
		// explicit wait - to wait for the compose button to be click-able
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	}
}
