package testcasejavaregister;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC_RF_001 {
	
	static WebDriver driver ; 

	public static void main(String[] args) throws InterruptedException {

		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	    // Web site URL we need to test
		String testURL = driver.getTitle();
		System.out.println(testURL);
		//Step-Click on 'My Account' Drop menu
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		//Step2- Click on 'Register' option 
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//Step3 Enter new Account Details into the Mandatory Fields (First Name, Last Name, E-Mail,Telephone, Password, Password
		driver.findElement(By.id("input-firstname")).sendKeys("SeleniumAkshay");
		driver.findElement(By.id("input-lastname")).sendKeys("Seleniumlastname");
		driver.findElement(By.id("input-email")).sendKeys("selenium2____a@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("+000002555255");		
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.id("input-confirm")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//step Click on 'Continue' button (ER-1)
		driver.findElement(By.linkText("Continue")).click();
		//Step-Click on 'Continue' button that is displayed in the 'Account Success' page (ER-2)
		Boolean Account = driver.findElement(By.linkText("Account")).isDisplayed();
		System.out.println("Account");
		Assert.assertTrue(Account);
		driver.quit();
		
		
	

	}

}
