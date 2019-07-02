package scroll;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("file:///D:/Practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		//js.executeScript("window.scrollBy(0,500)");
		
		WebElement ele=dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
		
		
		/*
		WebElement ele=dr.findElement(By.tagName("button"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		ele.click();		
		Alert al= dr.switchTo().alert();		
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());
		
		
		
		*/
		
		
		
		//****Scroll horizontally**********
				//js.executeScript("window.scrollBy(1000,0)");
				//js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");
				
				//******Scroll vertically******
				//js.executeScript("window.scrollBy(0,1000)");
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				//****Scroll horizontally and vertically both
				/*js.executeScript("window.scrollBy(0,1000)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(1000,0)");*/
				//js.executeScript("window.scrollTo(document.body.scrollWidth, document.body.scrollHeight)");
				
				
				/*//********Scroll till element is visible*******
				WebElement ele= dr.findElement(By.tagName("button"));
				js.executeScript("arguments[0].scrollIntoView();", ele);
				
				
				
		        //This will scroll the page Horizontally till the element is found		
		        js.executeScript("arguments[0].scrollIntoView();", ele);
			*/
				//This will scroll the web page till end.		
		        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				 // This  will scroll down the page by  1000 pixel vertical		
		        //js.executeScript("window.scrollBy(0,1000)");
				
				
				/*Select oSelect = new Select(ele);
				
				ele.sendKeys(Keys.PAGE_DOWN);
				ele.sendKeys(Keys.PAGE_DOWN);
				ele.sendKeys(Keys.PAGE_DOWN);*/
				
				//js.executeScript("window.scrollBy(1000,0)");
				
				//js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");
				

	}

}
