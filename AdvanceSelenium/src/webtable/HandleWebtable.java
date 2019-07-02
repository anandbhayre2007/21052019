package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
		
		int rows=dr.findElements(By.xpath("//table/tbody/tr")).size();
		int cols=dr.findElements(By.xpath("//table/tbody/tr[2]/td")).size();
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=2; r<=4; r++)
		{
			for(int c=1; c<=3; c++)
			{
				System.out.println(dr.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+c+"]")).getText());
			}
		}

	}

}
