package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Shankar Drarni\\eclipse-workspace\\SeleniumScripts\\Drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String ExpctedURL="https://www.amazon.com/";
		String ActualURL=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(ExpctedURL.equals(ActualURL)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

	}

}
