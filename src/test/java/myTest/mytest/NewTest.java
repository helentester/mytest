package myTest.mytest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() {
	  Assert.assertEquals("a", "a");
  }
  
  @Test
  public void ff(){
	  Assert.assertEquals(1, 1);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }



}
