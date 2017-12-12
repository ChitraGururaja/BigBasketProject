package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.genericPage;

public class indexPage extends genericPage{
	
	@FindBy(xpath="//i[@class='icon svg-header svg-arrow-down-hover svg-arrow-down-hover-dim']")
	private WebElement ShopByCategoryDD;
	
	@FindBy(xpath="//ul[@id='navBarMegaNav']//a[.='Beverages']")
	private WebElement BeveragesCategory;
	
	@FindBy(xpath="//ul[@id='navBarMegaNav']/following-sibling::div//a[.='Tea & Coffee']")
	private WebElement subOption;
	
	@FindBy(xpath="//ul[@id='navBarMegaNav']/following-sibling::div//a[.='Ground Coffee']")
	private WebElement option;
	
	
	
	public indexPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void mouseHoverToCategory(WebDriver driver){
		moveToElement(driver,ShopByCategoryDD);
		ShopByCategoryDD.click();
	}
	
	public void mouseHoverToSubCategory(WebDriver driver){
		moveToElement(driver,BeveragesCategory);
	}
	
	public void mouseHoverSubOption(WebDriver driver){
		moveToElement(driver, subOption);
	}
	
	public void clickOption(WebDriver driver){
		moveToElement(driver, option);
		option.click();
	}

}
