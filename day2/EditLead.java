package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CCN");

        //Using xpath create Lead and fill the form
	     // Enter the first Name field
	       WebElement firstname= driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
	       firstname.sendKeys("Test1");

	      // Enter the last Name field
	       WebElement lastname=   driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
	       lastname.sendKeys("Leaf1");

	     // Enter the FirstName (Local) field
	       WebElement firstname1=driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
	       firstname1.sendKeys("Test");
	     // Enter the Department field
	       WebElement department= driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"));
	       department.sendKeys("Health Care");
	       // Enter the Description 
	       WebElement description= driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
	       description.sendKeys("To learn Selenium");
	     // Enter the E-mail 
	        WebElement emailId= driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
            emailId.sendKeys("sample2@gmail.com");
	        // Select State/Province as New York using visible text
	        Select stateprDropdown = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
	        stateprDropdown.selectByVisibleText("New York");
	        // Click on the Create Button
	        WebElement create=driver.findElement(By.xpath("//input[@name='submitButton']"));
	        create.click();
	        // Click on the Edit Button after filling form
	        WebElement edit=driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit']"));
	        edit.click();
          // Locate the description field to enter any comments
	        WebElement descriptionField = driver.findElement(By.id("updateLeadForm_description"));
         // Clear the text in the description field
	        descriptionField.clear();
	     //Important note to be added 
	       WebElement NoteField = driver.findElement(By.id("updateLeadForm_importantNote"));
           NoteField.sendKeys("Lead has been created and edited");
        // Locate the update button 
          WebElement updateButton = driver.findElement(By.name("submitButton"));
       // Click on the update button
          updateButton.click();
       // Get the title of the current page
          String pageTitle = driver.getTitle();
          System.out.println("Page Title: " + pageTitle);
          driver.quit();

}
}	

		
	





