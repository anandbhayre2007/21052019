package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing2 {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
		
        String  node = "http://localhost:5566/wd/hub";
        
		WebDriver dr=new RemoteWebDriver(new URL(node), cap);
		
		dr.get("http://www.newtours.demoaut.com/");

	}

}
