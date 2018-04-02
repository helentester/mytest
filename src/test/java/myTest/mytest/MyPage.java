package myTest.mytest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyPage {
	@FindBy(id="kw")
	private WebElement kw_Element;
	
	@FindBy(id="su")
	private WebElement su_Element;
	
	public void kw_sendkes(String s){
		kw_Element.clear();
		kw_Element.sendKeys(s);
	}
	
	public void su_click() {
		su_Element.click();
	}
	
}
