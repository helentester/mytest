/**
 * @author:Helen
 * @date：2018年4月11日
 * @Description: 对应videoTest的所有页面
 */
package myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BasePage;

public class pageFor_videoTest extends BasePage{

	public pageFor_videoTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className="player-btn")
	private WebElement playerBTN;//首页直播区，进入学习按钮
	public void click_playerBTN() {
		this.click(playerBTN);	
	}
	
	@FindBy(id="loginform-username")
	private WebElement usernam;//ifram-用户名输入框
	public void sendkeys_username(String s) {
		this.sendkeys(usernam, s);
	}
	
	@FindBy(id="loginform-password")
	private WebElement password;//iframe-密码
	public void sendkeys_password(String s) {
		this.sendkeys(password, s);
	}
	
	@FindBy(className="btn-primary")
	private WebElement primaryBTN;//ifram-登录按钮
	public void click_primaryBTN() {
		this.click(primaryBTN);
	}
	
	@FindBy(xpath="html/body/div[12]/div/div[2]/div/a[1]")
	private WebElement closeBTN;//温馨提示-以后再说按钮
	public void click_closeBTN() {
		this.click(closeBTN);
	}
	
	@FindBy(linkText="课程")
	private WebElement courseLink;//首页-课程链接
	public void click_courseLink() {
		this.click(courseLink);
	}
	
	@FindBy(linkText="精品公开课")
	private WebElement publicCourseLink;
	public void click_publicCourseLink() {
		this.click(publicCourseLink);
	}
	
	@FindBy(xpath=".//*[@id='bd']/div/div[2]/ul/li/div/div/div[1]/ul/li[1]/div/a/img")
	private WebElement firstCourse;//排在第一的精品公开课
	public void click_firstCouse() {
		this.click(firstCourse);
	}
	
	@FindBy(xpath=".//*[@id='bd']/div[1]/div/div[2]/div[1]/div[1]/div/i")
	private WebElement playerIcon;//精品公开课的播放按钮
	public void click_playerIcon() {
		this.click(playerIcon);
	}
	
	@FindBy(tagName="embed")
	private WebElement videoSWF;
	public Boolean getBoolean() {
		return this.findMyElement(videoSWF).isDisplayed();
	}
}
