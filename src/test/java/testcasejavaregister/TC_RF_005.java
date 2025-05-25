package testcasejavaregister;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_005 {

	WebDriver driver;

	@Test
	
	public void openbrawser() throws InterruptedException {
		
		
    driver = new ChromeDriver();
    // maximize window 
    driver.manage().window().maximize();
    //impicit wait need to add 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    //Get Url
    driver.navigate().to("https://tutorialsninja.com/demo/");
    String URL = driver.getTitle();
    //print url 
    System.out.println("We are on Webpage - "+URL );
    //1. Click on 'My Account' Drop menu
    driver.findElement(By.linkText("My Account")).click();
    //2. Click on 'Register' option 
    driver.findElement(By.xpath("//a[text()='Register']")).click();
    //3. Enter new Account Details into all the Fields (First Name, Last Name, E-Mail,Telephone, Password, Password Confirm and  Privacy Policy Fields)
	driver.findElement(By.id("input-firstname")).sendKeys("SeleniumAkshay");
	driver.findElement(By.id("input-lastname")).sendKeys("Seleniumlastname");
	driver.findElement(By.id("input-email")).sendKeys(datee());
	driver.findElement(By.id("input-telephone")).sendKeys("+000002555255");		
	driver.findElement(By.id("input-password")).sendKeys("123456789");
	driver.findElement(By.id("input-confirm")).sendKeys("123456789");
	//4.Click on 'Yes' radio option for Newsletter 
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	driver.findElement(By.name("agree")).click();
	//5. Click on 'Continue' button (ER-1)
//	driver.findElement(By.className("btn btn-primary")).click();
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//print page 
	String URLnow = driver.getTitle();
	System.out.println(URLnow);
	// Wait thread 
	Thread.sleep(2000);
	}
	
	@Test
	//make email dyanamic 
	public String datee() {
		
		//Date emailsample = ;
		return new Date().toString().replace(" ", "").replaceAll(":", "")+"@Gmail.com";

	}
}
