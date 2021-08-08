package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;

public class Datepicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("https://jqueryui.com/datepicker/");
		
		
		// scrollDown
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		

		for(int i=1;i<=5;i++)
		{
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		}
		
		//driver.findElement(By.xpath("//span[text()='Prev']")).click();
		
		

		List<WebElement> allButtons=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement btn:allButtons)
		{
			String date=btn.getText();
			
			if(date.equals("30"))
				btn.click();
		}
		

		
	}
	

	}

