/**
 * @author:Helen
 * @date：2018年4月7日
 */
package myTest.mytest;

import myPages.PageForUItest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import common.BaseWindows;

/**
 * 描述：一些常见UI处理事件
 * */
public class UITest {
	BaseWindows windows = new BaseWindows();
	
	@Test(description="鼠标悬停事件")
	public void ActionTest(){
		WebDriver driver = windows.get_driver("https://www.baidu.com");
		PageForUItest myPage = PageFactory.initElements(driver, PageForUItest.class);
		Actions actions = new Actions(driver);
		actions.moveToElement(myPage.perform_shezhiLink()).perform();//鼠标悬停在“设置”上
		myPage.click_shousuoshezhiLink();
		myPage.clcik_sl1();
	}

	@Test(description="键盘操作",enabled=false)
	public void baidu_search() {
		WebDriver driver = windows.get_driver("https://www.baidu.com");
		PageForUItest myPage = PageFactory.initElements(driver, PageForUItest.class);
		myPage.kw_sendkes("helenMemery");//输入框插入数据
		myPage.click_KW();//键盘事件，回车键
		driver.quit();
	}

	@Test(description="窗口之间切换",enabled=false)
	public void changeWindows() {
		WebDriver driver = windows.get_driver("https://www.baidu.com");
		PageForUItest mypage = PageFactory.initElements(driver, PageForUItest.class);
		mypage.click_xueshuLink();
		mypage.click_xinwenLink();
		windows.changeWindow(driver);
		Assert.assertEquals(driver.getTitle(), "百度新闻——全球最大的中文新闻平台");
		driver.quit();
	}
	
	@Test(description="iframe与窗口之间的切换",enabled=false)
	public void changeIframe(){
		WebDriver driver = windows.get_driver("https://mail.163.com/");
		PageForUItest myPage = PageFactory.initElements(driver, PageForUItest.class);
		driver.switchTo().frame("x-URS-iframe");//切换到iframe中
		myPage.sendkeys_dlemail("testEmail");
		driver.switchTo().defaultContent();//回到主窗口
		myPage.click_yellowLink();
		driver.quit();
	}
	
	@AfterMethod
	public void close(){
		//driver.close();
	}

}
