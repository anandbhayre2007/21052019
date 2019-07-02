package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing {

	public static void main(String[] args) throws MalformedURLException 
	{
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WINDOWS);
       
        String  node = "http://192.168.1.11:5562/wd/hub";
        WebDriver dr = new RemoteWebDriver(new URL(node), capability);
        dr.get("https://www.google.com/");
        dr.manage().window().maximize();
        dr.findElement(By.name("q")).sendKeys("How are you priyanka");
        
        
	}

}
