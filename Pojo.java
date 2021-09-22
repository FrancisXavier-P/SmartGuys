package org.Pom;

import org.Sample.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	public Pojo() {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id= "email")
	private WebElement email;
	
	
	

	
	
	
	 

}
