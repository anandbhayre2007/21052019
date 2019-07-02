package libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class ApplicationLibrary 
{
	/*Author: Anand Bhayre
	 *Date : 28/06/2019
	 *Description: This function will launch the browser 
	 *Param: No parameter
	 *Return: It will return the instance of driver
	 */
	public WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", Config.chromeDriverPath);
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		return dr;
	}
	
	/*Author: Anand Bhayre
	 *Description: This function navigate to url
	 *Param: WebDriver and Url
	 *Return: It will return title of the the application
	 */
	public String navigate(WebDriver dr, String url)
	{
		dr.get(url);
		return dr.getTitle();
	}

	
	public boolean isElementPresent(WebDriver dr, By ele)
	{
		int size=dr.findElements(ele).size();
		
		if(size>=1)
		{
			return true;
		}else {
			return false;
		}
	}
}
