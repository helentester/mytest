package myTest.mytest;

import myPages.pageFor_videoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author helen
 * 描述：处理视频播放器
 */
public class videoTest {
  @Test(enabled=false)
  public void video_() {
	  //直播区
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.xsteach.com/");
	  driver.manage().window().maximize();
	  pageFor_videoTest videoPage = PageFactory.initElements(driver, pageFor_videoTest.class);
	  videoPage.click_playerBTN();
	  driver.switchTo().frame(driver.findElement(By.id("xs-pop-login-iframe")));//跳到登录的iframe
	  videoPage.sendkeys_username("");
	  videoPage.sendkeys_password("");
	  videoPage.click_primaryBTN();
	  driver.switchTo().defaultContent();//回到主窗口
	  videoPage.click_closeBTN();
  }
  
  @Test
  public void video_2(){
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.xsteach.com/");
	  driver.manage().window().maximize();
	  pageFor_videoTest videoPage = PageFactory.initElements(driver, pageFor_videoTest.class);
	  videoPage.click_courseLink();
	  videoPage.click_publicCourseLink();
	  videoPage.click_firstCouse();
	  String handle = driver.getWindowHandle();    
      // 获取所有页面的句柄，并循环判断不是当前的句柄   
      for (String handles : driver.getWindowHandles()) {    
          if (handles.equals(handle))    
              continue;    
          driver.switchTo().window(handles);    
      }  
	  videoPage.click_playerIcon();
	  Assert.assertTrue(videoPage.getBoolean());
  }
}
