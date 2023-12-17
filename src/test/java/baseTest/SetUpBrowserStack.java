package baseTest;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SetUpBrowserStack {
	public static String userName="vivekpandey_gNWqUC";
	public static String accessKey="1dFuRosd92qZ5FnkcXjB";
	public static String Url="https://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub";
	WebDriver driver;
	@Test
	public void setUp() throws MalformedURLException{
	   DesiredCapabilities caps=new DesiredCapabilities();
	   caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro");
	   caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
	  // caps.setCapability("build", "Chrome Broswer Script");
	   ////caps.setCapability("name", "Run Chrome in device");
	   driver = new RemoteWebDriver(new URL(Url),caps);
	   
//	}
//	@Test
//	public void test() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("https://ketobalanced.com/");
		driver.quit();
	}
}
