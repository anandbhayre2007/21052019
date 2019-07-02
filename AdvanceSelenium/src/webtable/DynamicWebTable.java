package webtable;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("http://newtours.demoaut.com/mercuryreservation2.php");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//*[@name='findFlights']")).click();
		
		dr.findElement(By.xpath("//form[@name='results']/table[1]/tbody/tr[7]/td[1]")).click();
		Set<Integer> set= new HashSet();
		
		
	}

}
