package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
		
		List<WebElement> list=dr.findElements(By.xpath("//table/tbody/tr"));
		int rows=list.size();
		System.out.println(rows);
		
		
		
		for(int r=2; r<=rows; r++)
		{
			list=dr.findElements(By.xpath("//table/tbody/tr["+r+"]/td"));
			int cols=list.size();
			System.out.println(cols);
			for(int c=1; c<=cols; c++)
			{
				String str=dr.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(str);
			}
		}
		
		
		
	}

}
