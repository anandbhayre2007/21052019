package basicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 {

	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		
		WebElement ele=dr.findElement(By.name("passCount"));
		
		Select sel= new Select(ele);
		
		sel.selectByIndex(2);
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		sel=new Select(dr.findElement(By.name("fromPort")));		
		sel.selectByIndex(3);
		
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		String str=dr.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']")).getText();
		
		System.out.println(str);
		
		dr.findElement(By.cssSelector("input[name='reserveFlights']")).click();
		
		dr.findElement(By.cssSelector("input[name='ticketLess']")).click();
		
		System.out.println(dr.findElement(By.cssSelector("input[name='ticketLess']")).isSelected());
		
		
	}
}