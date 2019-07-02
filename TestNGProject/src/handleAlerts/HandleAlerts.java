package handleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		WebElement ele2= dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView()", ele2);
		
		ele2.click();
		
		Alert alt=dr.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();		
		Thread.sleep(2000);		
		ele2.click();
		alt.dismiss();
	}

}
