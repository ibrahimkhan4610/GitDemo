package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicTest1 {

	@Test
	public void WebloginHomeLoan() {
		System.out.println("webloginHome");
	}

	@Test
	public void MobileloginHomeLoan() {
		System.out.println("MobileloginHome");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPIHome");
	}
	
	@BeforeTest
	 public void prerequiste()
	 {
		System.out.println("I will Execute first");
	 }

}
