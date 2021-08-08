package scripts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortingVetification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("animals"));
		Select se=new Select(element);
		List Orginallist=new ArrayList();              //orginal list variables in drop down
		List templlist=new ArrayList();                //Temprory list variables in drop down(we can creat)
		List<WebElement>Options=se.getOptions();
		for(WebElement e:Options) {
			Orginallist.add(e.getText());          
			templlist.add(e.getText());
		}
		 
		 System.out.println("before sorting orginal list"+Orginallist);
		System.out.println("before sorting temp list"+templlist);
		
		 Collections.sort(templlist);  //for sorting elements that method is sort mathod
		 
		 System.out.println("Aftersorting orginal list"+Orginallist);
		System.out.println("After sorting temp list"+templlist);
		
		if(templlist==Orginallist) {
			System.out.println("Dropdown Sorted");
		}
		else {
			System.out.println("Dropdown not Sorted");
		}
		
		
		
	
	
	
	}
	                               
	
}














	
	
	
	




 