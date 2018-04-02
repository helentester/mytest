package myTest.mytest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class myTestNg {
	private WebDriver driver = new FirefoxDriver();


	@Test
	public void f1() {
		MyPage myPage = PageFactory.initElements(driver, MyPage.class);
		driver.get("https://www.baidu.com");
		myPage.kw_sendkes("helen");
		myPage.su_click();
	}

	@Test
	public void f2() {
		Assert.assertEquals("b", "b");
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}

}
