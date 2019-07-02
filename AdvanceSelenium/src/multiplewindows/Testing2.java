package multiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("https://www.naukri.com/");
		
		
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		Set<String> set=dr.getWindowHandles();
		
		for(String w:set)
		{
			dr.switchTo().window(w);
			System.out.println(dr.getTitle());
		}
		
		int s=dr.findElements(By.xpath("//img[@alt='Toyo Engineering']")).size();
		
		System.out.println(s);
		
		Thread.sleep(15000);
		dr.switchTo().window(parent);
		s=dr.findElements(By.xpath("//span[@id='allow']")).size();
		
		System.out.println(s);
		
		dr.quit();
	}

}
