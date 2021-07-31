package TestScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteWebdriver {
	@Test
	public  void main(String a[]) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//DesiredCapabilities capabilities=new DesiredCapabilities().chrome();
		dc.setBrowserName("chrome");	
		//dc.setPlatform(Platform.WIN10);
		URL url=new URL("http://192.168.225.227:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,dc);
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Lib/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.out.println();
		driver.get("https://www.google.com/");	
		driver.quit();
		
	}

}
