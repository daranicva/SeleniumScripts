package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Shankar Drarni\\eclipse-workspace\\SeleniumScripts\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String expectedtitle ="Amazon.com. Spend less. Smile more.";
		String actualtitle =driver.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
