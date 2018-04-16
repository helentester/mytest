/**
 * @author Helen 
 * @date 2018年4月16日  
 */
package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 描述：窗口操作
 */
public class BaseWindows {
	WebDriver driver = new FirefoxDriver();

	/* 获取driver驱动 */
	public WebDriver get_driver(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	/* 切换窗口操作 */
	public void changeWindow(WebDriver driver) {
		// 获取当前窗口的句柄
		String handle = driver.getWindowHandle();
		// 获取所有页面的句柄，并循环判断不是当前的句柄
		for (String handles : driver.getWindowHandles()) {
			if (handles.equals(handle))
				continue;
			driver.switchTo().window(handles);
		}
	}

}