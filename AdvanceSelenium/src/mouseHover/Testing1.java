package mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testing1 {

	@Test(dataProvider="getdata")
	public  void test1(String mega, String l1, String l2) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		
		dr.get("https://www.flipkart.com");
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act= new Actions(dr);
		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='"+mega+"']"))).build().perform();

		WebElement ele=dr.findElement(By.xpath("//span[text()='"+mega+"']/following::a[text()='"+l1+"']/parent::li/following-sibling::li/a[text()='"+l2+"']"));
		
		WebDriverWait wait= new WebDriverWait(dr, 60);			
		wait.until(ExpectedConditions.visibilityOf(ele)).click();
		
		Thread.sleep(2000);
		
		ele=dr.findElement(By.xpath("//div[@class='_3aQU3C']"));
		
		act.dragAndDropBy(ele, 50, 0).build().perform();
		
		dr.close();
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[2][3];
		
		data[0][0]="Men";
		data[0][1]="Top wear";
		data[0][2]="Shirts";
		
		data[1][0]="Women";
		data[1][1]="Sandals";
		data[1][2]="Flats";
		
		return data;
		
	}

}
