package Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.genericTest;


public class riceAndAtta extends genericTest {
	
	@Test
	public void addRiceAndAttaProduct(){
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	for(int i=0;i<6;i++){
	js.executeScript("window.scrollBy(0,500)");
	}
	

}
}
