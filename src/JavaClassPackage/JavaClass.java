package JavaClassPackage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {
	
    WebDriver driver = new ChromeDriver() ;
	//String myWeb = "https://www.google.com";
	String myWebsite ="https://smartbuy-me.com/smartbuystore/en/login";
	String myMobile = "796700346";
    // int myMobile = 796700346;
	int myNum = 2;

	
	

	@BeforeTest

	public void myBeforeTest() {
		
		
		//String myName = "noor taslaq";
		
		//myName.replace("n", "a");
		// System.out.println(myName.charAt(0));
		//System.out.println(myName.toUpperCase().charAt(0));
		//System.out.println(myName.replace("n", "a"));
        driver.manage().window().maximize();
		
	}
	

	
	@Test (invocationCount = 8)
	
	public void test () throws InterruptedException {
		
		
		//driver.get(myWeb.toUpperCase());
//		driver.get(myWebsite);
//		WebElement mobileNumberInput = driver.findElement(By.id("mobileNumber"));	
//		mobileNumberInput.sendKeys(myMobile);
		
//		System.out.println(Math.pow(myNum, myNum));
//		System.out.println(Math.pow(myNum, 3));
		//System.out.println(Math.abs(myNum));القيمة المطلفة بترجع الرقم بدون سالب 
	String firstName = "John";
	String lastName = "Doe";
	String domain ="@gmail.com";
	Random rand = new Random ();
	int randomID = rand.nextInt(10);
//		String space = " ";
//		System.out.println(firstName.concat(space).concat(lastName));
	//  Math.random();
	//System.out.println(firstName.concat(lastName)+randomID+domain);
    driver.get("https://smartbuy-me.com/smartbuystore/en/login");
    Thread.sleep(2000);
    driver.findElement(By.id("register.email")).sendKeys(firstName.concat(lastName)+randomID+domain);
    Thread.sleep(1000);
		
		
	}
	
	
}
