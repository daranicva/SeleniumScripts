package scripts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alertrs {

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
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
	String actualTxt=	driver.switchTo().alert().getText();
		String ExpectedTxt="I am an alert box!";
	if(actualTxt.equals(ExpectedTxt)) {
		System.out.println("test case pass");
	}else {
		System.out.println("test case fail");
	}
	driver.switchTo().alert().accept();
	             

	}

}
