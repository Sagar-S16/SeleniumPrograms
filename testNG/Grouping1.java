package testNG;

import org.testng.annotations.Test;

public class Grouping1 {
  @Test(groups = {"smoke"})
  public void smokeTest1() {
	  System.out.println("smoke test 1");
  }
  @Test(groups = {"smoke"})
  	public void smokeTest2() {
	  System.out.println("smoke test 2");
  }
  @Test(groups = {"regression"})
  public void regressionTest() {
	  System.out.println("Regression Testing");
  }
}
