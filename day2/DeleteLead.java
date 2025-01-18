package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Load the url
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on the leads
		driver.findElement(By.linkText("Leads")).click();
		//click on Findleads
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		//Click Phone tab
	    driver.findElement(By.linkText("Phone"));;
	    WebElement phone = driver.findElement(By.linkText("Phone"));
	      phone.click();
	      //Click Phone Number in phone tab//
	    WebElement phNumber= driver.findElement(By.name("phoneNumber"));
	      phNumber.sendKeys("9767826990"); 
	    //Click on find leads and fetch the first row//
	     WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		 findLeadsButton.click();
		  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sam");
          driver.quit();


	}

}
