package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		/*	driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
        WebElement   interaction=driver.findElement(By.xpath("//a[text()='Interactions ']"));
        WebElement DragAndDrop= driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
        WebElement Static= driver.findElement(By.xpath("//a[@href='Static.html']"));
        Actions ac=new Actions(driver);
        ac.moveToElement(interaction).moveToElement(DragAndDrop).moveToElement(Static).click().build().perform();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement drag= driver.findElement(By.id("node"));
        WebElement drop= driver.findElement(By.id("droparea"));
       ac.dragAndDrop(drag, drop).build().perform();*/
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement examples=driver.findElement(By.xpath("//h2[text()='Examples']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", examples);
		
		Thread.sleep(3000);
	    driver.switchTo().frame(0);
	    WebElement source=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	    WebElement target=driver.findElement(By.xpath("//p[text()='Drop here']"));
	    Actions action=new Actions(driver);
	    action.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);

	}

}
