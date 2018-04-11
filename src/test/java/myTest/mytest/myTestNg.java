/**
 * @author:Helen
 * @date：2018年4月7日
 * @Description: 百度搜索测试
 */
package myTest.mytest;

import myPages.MyPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class myTestNg {
	private WebDriver driver = new FirefoxDriver();

	@Test
	public void baidu_search() {
		MyPage myPage = PageFactory.initElements(driver, MyPage.class);
		driver.get("https://www.baidu.com");
		driver.manage().window().maximize();//窗口最大化
		myPage.kw_sendkes("helenMemery");
		myPage.su_click();
	}

	@Test
	public void f2() {
		Assert.assertEquals("b", "b");
	}
	
	@AfterMethod
	public void close(){
		//driver.close();
	}

}
