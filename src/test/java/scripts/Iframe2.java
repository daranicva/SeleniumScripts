package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		WebElement box=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
         box.sendKeys("bye");
         Thread.sleep(3000);
         driver.switchTo().defaultContent();
         driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
         driver.switchTo().frame(1);
         Thread.sleep(3000);
       //  driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hhh");
         
         
	}

	
}
