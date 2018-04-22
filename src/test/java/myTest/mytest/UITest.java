/**
 * @author:Helen
 * @date：2018年4月7日
 */
package myTest.mytest;

import myPages.PageForUItest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import common.BaseWindows;

/**
 * 描述：一些常见UI处理事件
 * */
@Test(groups="UITest")
public class UITest {
	BaseWindows windows = new BaseWindows();
	WebDriver driver;
	PageForUItest myPage;
	
	@BeforeMethod
	private void start() {
		driver = windows.get_driver("https://www.baidu.com");
		myPage = PageFactory.initElements(driver, PageForUItest.class);
	}
	
	@Test(description="鼠标悬停事件")
	public void ActionTest(){
		Actions actions = new Actions(driver);
		actions.moveToElement(myPage.perform_shezhiLink()).perform();//鼠标悬停在“设置”上
		myPage.click_shousuoshezhiLink();
		myPage.clcik_sl1();
	}

	@Test(description="键盘操作")
	public void baidu_search() {
		myPage.kw_sendkes("helenMemery");//输入框插入数据
		myPage.click_KW();//键盘事件，回车键
	}

	@Test(description="窗口之间切换",enabled=false)
	public void changeWindows() {
		myPage.click_xueshuLink();
		myPage.click_xinwenLink();
		windows.changeWindow(driver);
		Assert.assertEquals(driver.getTitle(), "百度新闻——全球最大的中文新闻平台");
	}
	
	@Test(description="iframe与窗口之间的切换",enabled=false)
	public void changeIframe(){
		driver = windows.get_driver("https://mail.163.com/");
		myPage = PageFactory.initElements(driver, PageForUItest.class);
		driver.switchTo().frame("x-URS-iframe");//切换到iframe中
		myPage.sendkeys_dlemail("testEmail");
		driver.switchTo().defaultContent();//回到主窗口
		myPage.click_yellowLink();
	}
	
	@AfterClass
	private void end(){
		driver.quit();
	}

}
