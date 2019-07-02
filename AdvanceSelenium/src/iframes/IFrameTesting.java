package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB46772\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();			
		dr.get("https://paytm.com/");
		dr.manage().window().maximize();
		//Thread.sleep(3000);		
		dr.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
		
		Thread.sleep(2000);	
		
		//dr.findElement(By.xpath("//a[@title='Close']")).click();
		
		//dr.switchTo().frame(0);	
		WebElement ele= dr.findElement(By.tagName("iframe"));
		dr.switchTo().frame(ele);
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();

		//dr.switchTo().defaultContent();
		
		//dr.findElement(By.xpath("//a[@title='Close']")).click();
	}

}
