package seleniumPgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\120CD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.get("https://demo.guru99.com/V4/");
//		WebDriverWait wt = new WebDriverWait(driver, 10);

	//	wt.until(ExpectedConditions
	//			.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]")));
		  //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        WebElement button =driver.findElement(By.name("btnLogin"));			
		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr542822");					
        driver.findElement(By.name("password")).sendKeys("zyteban");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to Guru99');"); 
        
        Thread.sleep(3000);
		driver.quit();
		System.out.println("Test complete");
	}

}
