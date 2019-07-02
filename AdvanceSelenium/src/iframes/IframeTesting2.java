package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTesting2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("https://paytm.com/");
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		int ifrms=dr.findElements(By.tagName("iframe")).size();
		System.out.println(ifrms);
		
		dr.switchTo().frame(0);
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
	}

}
