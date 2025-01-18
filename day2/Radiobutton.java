package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver1=new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.leafground.com/radio.xhtml");
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to click account buttton//
		WebElement edge = driver1.findElement(By.xpath("//label[@for='j_idt87:console1:3']"));
        edge.click();
        System.out.println("Edge is my favorite browser");

        WebElement radiobutton = driver1.findElement(By.xpath("//label[@for='j_idt87:console1:3' and @checked]"));
	    if(radiobutton.isSelected());
		System.out.println("edge Browser is selected");
				
		//performing click operation only if element is not selected
		//if(selectState == false) {
			//radiobutton.click();
			//System.out.println(" Safari browser is not selected");
	
		//to click account buttton//
				WebElement defaultbutton= driver1.findElement(By.xpath("//label[@for='j_idt87:console2:2'and @checked]"));
		       System.out.println("Safari Browser is selected by deafult");
						
				//performing click operation only if element is not selected
				 if(defaultbutton.isSelected());
					System.out.println("Safari Browser is not selected");
	}

	          WebElement defaultbutton= driver1.findElement(By.xpath("//label[@for='j_idt87:console2:2'and @checked]"));
		        if (agecheck.isSelected()) {
		            System.out.println("The '21-40 Years' radio button is selected by default");
		        } else {
		            System.out.println("The '21-40 Years' radio button is not selected by default ");
		        }
}

}

