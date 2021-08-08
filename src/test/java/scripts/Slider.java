package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement Choosefile=driver.findElement(By.id("imagesrc"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
				//JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",Choosefile);
		
	}

}
