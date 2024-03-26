package Almosafer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlmosaferTestCAse extends Parameters {
	@BeforeTest
	public void mySetup() {
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement popup = driver.findElement(By.cssSelector(".sc-ekkqgF.iUJdPa.Modal__BodyContainer"));
		if(popup.isDisplayed()) {
			WebElement buttonSAR = driver.findElement(By.cssSelector("button[class='sc-jTzLTM hQpNle cta__button cta__saudi btn btn-primary']"));
			buttonSAR.click();
		}
	}
	
	@Test
	public void languagesTest() {
		
	}
}
