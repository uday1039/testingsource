package hero;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pack {
	WebDriver driver;

	@BeforeSuite
	public void beforesuite() {

		System.out.println("befor suite");

	}

	@BeforeTest
	public void beforetest() {
		System.out.println("befor test");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("befor class");

	}

	@Test
	public void test() {
		System.out.println("test");

	}

	@Test
	public void test1() {
		System.out.println("test1");

	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");

	}

	@AfterTest
	public void aftertest() {
		System.out.println("after test");

	}

	@AfterClass
	public void afterclass() {
		System.out.println("after class");

	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");

	}

}
