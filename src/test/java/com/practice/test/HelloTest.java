package com.practice.test;


import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.practice.base.BaseTest;

public class HelloTest extends BaseTest {
	
	
	
	
	@Test
	public void m1()
	{
		System.out.println("Ashok.....");
		//WebDriver driver=new ChromeDriver();
		//BasicConfigurator.configure();
		
		logger.info("\n\nProgram...finished.............");
		
	}

}
