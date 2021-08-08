package scripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	WebElement Skills=	driver.findElement(By.id("Skills"));
		Select select=new Select(Skills);
		//select.selectByIndex(9);
	select.selectByVisibleText("C");
	List<WebElement> alloptions=select.getOptions();
	for(WebElement opt: alloptions)
	{
		System.out.println(opt.getText());
	}
	}
}
