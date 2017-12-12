package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class genericPage {
	
	public void moveToElement(WebDriver driver,WebElement element){
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

}
