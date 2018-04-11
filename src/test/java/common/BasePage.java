/**
 * @author:Helen
 * @date：2018年4月7日
 * @Description: 处理页面元素公共类，重写页面操作事件，为每个元素加入显式等待
 */
package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	private final int timeOut = 10;//等待时间

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	/* 重写senkeys方法 */
	public void sendkeys(WebElement element, String s) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));// 加入显式等待
		element.clear();// 先清空输入框
		element.sendKeys(s);// 输入数据
	}

	/* 重写click方法 */
	public void click(WebElement element) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));// 加入显式等待
		element.click();
	}
	
	/*重写findElement方法*/
	public WebElement findMyElement(WebElement element) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		return element;
	}
}
