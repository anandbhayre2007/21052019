package handleIframes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("https://paytm.com/");
		
		Thread.sleep(5000);		
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		Thread.sleep(10000);
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
		dr.switchTo().defaultContent();
		Thread.sleep(5000);
		dr.findElement(By.xpath("//a[text()='X']")).click();

	}

}
