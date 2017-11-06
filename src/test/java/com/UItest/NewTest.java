package com.UItest;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  public void f() {
	  //1+1=2
	  Assert.assertEquals(1+1, 3);
	  
  }
  @Test
  public void f1() {
	//2+2=4
	  Assert.assertEquals(2+2, 4);
  }
  @Test
  public void f2() {
	//2+2=4
	  Assert.assertEquals(2+2, 5);
  }
}
