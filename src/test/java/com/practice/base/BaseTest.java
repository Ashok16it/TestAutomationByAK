package com.practice.base;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeSuite;

 public class BaseTest {
	
	public static Logger logger=Logger.getLogger(BaseTest.class);
	
	@BeforeSuite
	public void startup()
	{
		DOMConfigurator.configure("log4j.xml");
		
		logger.info("Program...started.............from BaseTest");
	}

}
