package myTest.mytest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class NewTest {
  @Test(priority=2)
  public void f() {
	  Assert.assertEquals("a", "a");
  }
  
  @Test(priority=1,enabled=false)
  public void ff(){
	  Assert.assertEquals(1, 1);
  }
  
  @Test
  public void m1() {
	  System.out.println("方法m1");
}
  @Test(dependsOnMethods="m1")
  public void m2(){
	  System.out.println("方法m2");
  }
  
  @Test(dataProvider="users")
  public void p1(String username,String password){
	  System.out.println("用户名："+username);
	  System.out.println("密码："+password);
  }
  
  @DataProvider(name="users")
  public Object[][] myUsers(){
	  Object[][] users = new Object[][]{
		  {"user1","password1"},
		  {"user2","password2"}
	  };
	  return users;
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }



}
