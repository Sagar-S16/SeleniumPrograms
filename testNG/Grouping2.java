package testNG;

import org.testng.annotations.Test;

  @Test
  public class Grouping2 {
	  @Test(groups = {"smoke"})
	  public void smokeTest3() {
		  System.out.println("smoke test 3");
	  }
	  @Test(groups = {"smoke"})
	  	public void smokeTest4() {
		  System.out.println("smoke test 4");
	  }
	  @Test(groups = {"regression"})
	  public void regressionTest() {
		  System.out.println("Regression Testing");
	  }

}
