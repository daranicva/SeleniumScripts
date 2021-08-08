package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsWithText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement switch2= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement alerts =driver.findElement(By.xpath("//a[text()='Alerts']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(switch2).moveToElement(alerts).click().build().perform();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		driver.switchTo().alert().sendKeys("hi");
		driver.switchTo().alert().accept();
		WebElement ActualDfaultAlrartMsg=driver.findElement(By.id("demo1"));
		 String  ExpectedlAlrartMsg  ="Hello hi How are you today"; 
		 if(ExpectedlAlrartMsg.equals(ActualDfaultAlrartMsg)) {
			 System.out.println("pass");
		 }
		 else {
			 System.out.println("fail");
		 }
		System.out.println(ActualDfaultAlrartMsg.getText());
       
	}

}
