/**
 * @author:Helen
 * @date：2018年4月7日
 * @Description: 百度页面，对象定位和操作，继承BasePage
 */
package myPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class PageForUItest extends BasePage{
	public PageForUItest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	/******************百度首页****************************/
	@FindBy(id="kw")
	private WebElement kw_Element;//关键词输入框
	public void kw_sendkes(String s){
		this.sendkeys(kw_Element, s);//输入关键词
	}
	public void click_KW() {
		this.findMyElement(kw_Element).sendKeys(Keys.ENTER);//回车
	}
	
	@FindBy(id="su")
	private WebElement su_Element;//“搜索”按钮
	public void su_click() {
		this.click(su_Element);//点击“搜索”按钮
	}
	
	@FindBy(linkText="设置")
	private WebElement shezhiLink;//设置链接
	public WebElement perform_shezhiLink() {
		return this.findMyElement(shezhiLink);
	}
	
	@FindBy(linkText="搜索设置")
	private WebElement shousuoshezhiLink;//"搜索设置"
	public void click_shousuoshezhiLink() {
		this.click(shousuoshezhiLink);
	}
	
	@FindBy(linkText="学术")
	private WebElement xueshuLink;//"学术"链接
	public void click_xueshuLink() {
		this.click(xueshuLink);//点击学术链接
	}
	
	@FindBy(linkText="新闻")
	private WebElement xinwenLink;//新闻链接
	public void click_xinwenLink() {
		this.click(xinwenLink);//点击新闻链接
	}
	
	@FindBy(name="tj_login")
	private WebElement tjLoginLink;//“登录”链接
	public void clickTjLoginLink() {
		this.click(tjLoginLink);
	}
	
	/*************百度搜索设置页面********************/
	@FindBy(id="SL_1")
	private WebElement sl1;//仅简体中文 radio插件
	public void clcik_sl1() {
		this.click(sl1);
	}
	
	/*************163邮箱登录页面*******************/
	@FindBy(className="dlemail")
	private WebElement dlemail;//邮箱名
	public void sendkeys_dlemail(String s) {
		this.sendkeys(dlemail, s);
	}
	
	@FindBy(linkText="邮箱黄页")
	private WebElement yellowLink;
	public void click_yellowLink() {
		this.click(yellowLink);
	}
}