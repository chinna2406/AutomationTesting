package TestScript;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCaseOne {
  @Test
  public void Tc1() {
	  Assert.assertEquals(200, 21);
  }
  @Test
  public void Tc2() {
	  Assert.assertEquals(200, 200);
  }
  @Test
  public void Tc3() {
	  Assert.assertEquals(200, 200);
  }
  @Test
  public void Tc4() {
	  Assert.assertEquals(200, 20);
  }
}
