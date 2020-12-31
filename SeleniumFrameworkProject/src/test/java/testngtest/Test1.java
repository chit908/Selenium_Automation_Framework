package testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeClass()
		
		public void beforetest() {
			System.out.println("I want to run before the test");
			
		}
	
	@AfterClass()
	
	public void aftertest() {
		System.out.println("I want to run after the test");
	}
	
  @Test(groups= {"regression"})
  
  public void printName(){
	  
	  System.out.println("My name is Chitra");
	 
  }
}
