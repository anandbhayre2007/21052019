package multiplewindows;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testinng {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();	
		dr.get("https://www.naukri.com/");
		
		String parent=dr.getWindowHandle();	
		System.out.println(parent);
		Set<String> wins=	dr.getWindowHandles();
		
		for(String s:wins)
		{
			if(!s.equals(parent))
			{
				dr.switchTo().window(s);
				dr.close();
			}
		}
		
		dr.switchTo().window(parent);
		System.out.println(dr.getTitle());
	}

}
