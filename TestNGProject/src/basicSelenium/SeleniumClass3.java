package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass3 {

	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.linkText("REGISTER")).click();		
		Thread.sleep(3000);
				
		dr.findElement(By.partialLinkText("SUPP")).click();
		
		String width=dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("width");
		String height=dr.findElement(By.xpath("//img[@alt='Mercury Tours']")).getAttribute("height");
		
		System.out.println(width);
		System.out.println(height);
		
		
	}
}
