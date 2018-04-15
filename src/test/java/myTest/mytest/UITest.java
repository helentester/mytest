/**
 * @author:Helen
 * @date：2018年4月7日
 */
package myTest.mytest;

import myPages.PageForUItest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 描述：一些常见UI处理事件
 * */
public class UITest {
	private WebDriver driver = new FirefoxDriver();

	@Test
	public void baidu_search() {
		PageForUItest myPage = PageFactory.initElements(driver, PageForUItest.class);
		driver.get("https://www.baidu.com");
		driver.manage().window().maximize();//窗口最大化
		myPage.kw_sendkes("helenMemery");//输入框插入数据
		myPage.su_click();//按钮点击
		driver.quit();
	}

	@Test(description="主窗口与ifram之间的切换")
	public void changeIframe() {
		Reporter.log("啦啦啦 啦啦啦 我就输出个日志而已啦");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void close(){
		//driver.close();
	}

}
