package myTest.mytest;

import org.testng.annotations.Test;
import org.testng.Assert;

public class myTestNg {
  @Test
  public void f1() {
	  Assert.assertEquals("a", "a");
  }
  
  @Test
  public void f2(){
	  Assert.assertEquals("b", "b");
  }

}
