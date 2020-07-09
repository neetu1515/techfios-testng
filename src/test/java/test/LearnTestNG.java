package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnTestNG {
	
	//@BeforeTest
	//@BeforeMethod--1
	//@Test
	//@Test
	//@AfterMethod
	//@AfterTest
	
	
	@BeforeTest
	public void a() {
		System.out.println("a");
	}
	@BeforeMethod
	public void b() {
		System.out.println("b");
	}
	@Test()
	public void c() {
		System.out.println("c");
	}
	
	public void d() {
		System.out.println("d");
	}
	@AfterMethod
	public void e() {
		System.out.println("e");
	}
	@AfterTest
	public void f() {
		System.out.println("f");
	}
	
	
		
	
	
	
	

}
