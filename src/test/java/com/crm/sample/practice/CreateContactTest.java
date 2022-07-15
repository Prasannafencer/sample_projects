package com.crm.sample.practice;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test
	public void creatContact() {
		String Browser = System.getProperty("Browser");
		System.out.println(Browser);
		//String url= System.getProperty("url");
		
		System.out.println("Contact Created");
	}
	@Test
	public void deletContactAndverify() {
		System.out.println("Contact deleted");
	}
}
