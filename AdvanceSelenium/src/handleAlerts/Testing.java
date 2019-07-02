package handleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
	
		
		Select sel= new Select(dr.findElement(By.id("anand")));
		
		sel.selectByIndex(0);
		sel.selectByVisibleText("Ashutosh");
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		WebElement ele=dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//ele.click();
		
		Alert al= dr.switchTo().alert();
		
		
		
		System.out.println(al.getText());
		
		//al.accept();
		al.dismiss();
	}

}
