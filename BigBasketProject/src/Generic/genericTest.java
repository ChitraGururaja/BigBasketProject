package Generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class genericTest implements constants {

	public WebDriver driver;
	
@BeforeTest
public void openApp() throws InterruptedException{
	if(constants.browser.equals("firefox")){
	
		//System.setProperty("webdriver.gecko.driver", "./Jars/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(constants.browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Jars/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.
		driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.bigbasket.com/");
	//driver.manage().window().maximize();
}

@AfterMethod
public void closeApp(){
	//driver.quit();
	
}



}
