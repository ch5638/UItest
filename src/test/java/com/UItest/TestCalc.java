package com.UItest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.UItest.Calc;



public class TestCalc {
  @Test
  public void f1() {
	  Calc calc = new Calc();
	  Assert.assertEquals(calc.add(1, 2), 3);
  }
  @Test
  public void f2() {
	  Calc calc = new Calc();
	  Assert.assertEquals(calc.add(2, 3), 7);
  }
  @Test
  public void f3() {
	  Calc calc = new Calc();
	  Assert.assertEquals(calc.minus(2, 3), -1);
  }
  @Test
  public void f4() {
	  Calc calc = new Calc();
	  Assert.assertEquals(calc.minus(2, 3), -5);
  }
}
