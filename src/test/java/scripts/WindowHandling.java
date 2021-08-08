package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		for(String all:allWindows)
		if (!mainwindow.equals(all)) {
			driver.switchTo().window(all);
			driver.manage().window().maximize();
		    driver.findElement(By.xpath("/html/body/a/img")).click();
			
			
			
		}
		
		
	}

}
