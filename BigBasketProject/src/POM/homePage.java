package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.genericPage;

public class homePage extends genericPage {
	
	@FindBy (xpath="(//button[.='Add '])[10]")
	private WebElement addBtn;
	
	@FindBy (xpath="//div[@id='navbar-main']//span[@class='basket-content']")
	private WebElement basketIcon;
	
	@FindBy (xpath="//button[.='View Basket & Checkout']")
	private WebElement checkoutButton;
	
	//@FindBy (xpath="//div[@id='headerControllerId']//span[@class='arrow-marker']")
	@FindBy (xpath="//header[@class='hidden-sm hidden-xs ng-scope']//a[.='Continue']")
	private WebElement continueBtn;
	
	
	public homePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddBtn(){
		addBtn.click();
	}
	
	public void mouseHoverOnBasket(WebDriver driver){
		moveToElement(driver, basketIcon);
	}
	
	public void clickCheckoutButton(){
		checkoutButton.click();
	}
	
	
	public void clickContinueBtn(){
		try{
			continueBtn.click();
		}
		catch(Exception e){
			System.out.println("->>>>>>>>>>>>>>>>>>>>inside catch");
		}
	}

}
