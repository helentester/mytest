package myTest.mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPage extends BasePage{
	public MyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="kw")
	private WebElement kw_Element;
	
	@FindBy(id="su")
	private WebElement su_Element;
	
	public void kw_sendkes(String s){
		this.sendkeys(kw_Element, s);
	}
	
	public void su_click() {
		this.click(su_Element);
	}
	
}
