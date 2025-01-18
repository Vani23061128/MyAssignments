package week2.day2;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//to click account buttton//
	WebElement Accountbutton = driver.findElement(By.linkText("Create new account"));
	Accountbutton.click();
	//enter the firstname and surname//
	WebElement firstname=driver.findElement(By.name("firstname"));
	firstname.sendKeys("Vani");
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("Gani");

	//To select the Date of birth//
	 WebElement daydropdown=(driver.findElement(By.id("day")));
	 new Select(daydropdown).selectByVisibleText("23");
	WebElement monthdropdown=driver.findElement(By.id("month"));
	 new Select(monthdropdown).selectByVisibleText("Feb");
	WebElement yeardropdown=driver.findElement(By.id("year"));
	new Select(yeardropdown).selectByVisibleText("1994"); 
	//To select gender//
	WebElement radioButton = driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
	radioButton.click();
	//To enter mobilenum or email address and new pwd//
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 WebElement email = wait.until(
             ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__"))
     );
     email.sendKeys("8907685467");

     //Enter new password


     WebElement password = wait.until(
             ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))
     );
     password.sendKeys("Van@23245");
	 driver.quit();

	
}
}