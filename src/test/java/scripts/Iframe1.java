package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
	WebElement nsm=	driver.findElement(By.id("nseindex"));
	System.out.println(nsm.getText());
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("CRICKET")).click();
	}
}
