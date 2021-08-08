package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Shankar Drarni\\eclipse-workspace\\SeleniumScripts\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("pass"));
		
		
		if(email.isDisplayed()&&email.isEnabled()) {
			email.sendKeys("daranicva@gmailcom");
		}
		if(pwd.isDisplayed()&&pwd.isEnabled()) {
			pwd.sendKeys("sivashankar");
		}
		
	 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	WebElement Female= driver.findElement(By.xpath("//label[text()='Female']"));
	if(Female.isSelected()==false) {
		
		Female.click();
		System.out.println("pass");
	}else {
		
		System.out.println("testcase fail");
	}
	
	}

}










