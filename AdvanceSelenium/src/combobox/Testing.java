package combobox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testing {
	
	@Test
	public  void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
		
		
		Select sel= new Select(dr.findElement(By.id("anand")));
		
		sel.selectByIndex(0);
		sel.selectByIndex(2);
		sel.selectByIndex(4);
		
		sel.deselectAll();
		
	}

}
