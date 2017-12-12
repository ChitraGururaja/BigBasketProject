package Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.genericTest;
import POM.homePage;
import POM.indexPage;

public class  beverages extends genericTest
{
	@Test
	public void addProduct() throws InterruptedException
	{
		
		indexPage ip = new indexPage(driver);
		ip.mouseHoverToCategory(driver);
		ip.mouseHoverToSubCategory(driver);
		ip.mouseHoverSubOption(driver);
		ip.clickOption(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int i=0;i<4;i++){
		js.executeScript("window.scrollBy(0,300)");
		}
		homePage hp = new homePage(driver);
		hp.clickAddBtn();
		hp.clickContinueBtn();
		hp.mouseHoverOnBasket(driver);
		hp.clickCheckoutButton();
	}
}