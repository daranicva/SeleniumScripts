package scripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoockiesExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	       
		WebDriver driver=new ChromeDriver( );
		driver.get("https://www.amazon.in/");
	    Set<Cookie>cookies=driver.manage().getCookies(); //capture all the cookies from the browser
	    cookies.size();         // this method gives how many coockies are created 
	    System.out.println("size of cookies:"+cookies.size());
	  /*
	    for(Cookie cookie:cookies) {  //read and prin all cookies
	    	System.out.println(cookie.getName()+":"+cookie.getValue());
	    	
	    }*/
	  // System.out.println(driver.manage().getCookieNamed("session-id-time")); //this is how we get cookie based upon the name
      
	  //add new cookie in to browser
	    Cookie cobj =new Cookie("Mycookie1234","1234567890");
       driver.manage().addCookie(cobj);
       cookies=driver.manage().getCookies(); //this also need to add new cookie
       System.out.println("size of cookies:"+cookies.size());
      
       for(Cookie cookie:cookies) {  //read and prin all cookies
	    	System.out.println(cookie.getName()+":"+cookie.getValue());
	    	
	    }
       //delete cookie
       driver.manage().deleteCookie(cobj);
    
       cookies=driver.manage().getCookies(); //this also need to delete new cookie
       System.out.println("size of cookies:"+cookies.size());
      
       for(Cookie cookie:cookies) {  //read and prin all cookies
	    	System.out.println(cookie.getName()+":"+cookie.getValue());
	}
       driver.manage().deleteAllCookies();
      cookies=driver.manage().getCookies(); //this also need to delete new cookie
      System.out.println("size of cookies:"+cookies.size());
      

}}







