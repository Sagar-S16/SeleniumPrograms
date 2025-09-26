package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationEx {

  @BeforeSuite
  public void beforeSuite() {
    System.out.println("BeforeSuite: Runs before the entire test suite starts");
  }

  @AfterSuite
  public void afterSuite() {
    System.out.println("AfterSuite: Runs after the entire test suite ends");
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("BeforeTest: Runs before any test in the <test> tag of testng.xml");
  }
  @AfterTest
   public void afterTest() {
    System.out.println("AfterTest: Runs after all tests in the <test> tag of testng.xml");
  }

  @BeforeClass
  public void beforeClass() {
    System.out.println("BeforeClass: Runs before the first method in the current class");
  }

  @AfterClass
  public void afterClass() {
    System.out.println("AfterClass: Runs after all methods in the current class have run");
  }

  @BeforeMethod
  public void beforeMethod() {
    System.out.println("BeforeMethod: Runs before each @Test method");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("AfterMethod: Runs after each @Test method");
  }

  @Test
  public void test() {
    System.out.println("Test: This is the actual test method");
  }
}
