package FeaceBook;
import org.openqa.selenium.By;

import reusable.Auto;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webAuto.gecko.Auto", "E:\\SeleniumRequriments\\geckoAuto.exe");
		WebAuto Auto=new FirefoxAuto();
		Auto.get("https://www.freecrm.com/");
		Auto.findElement(By.name("username")).sendKeys("manoj");
		Auto.findElement(By.name("password")).sendKeys("774647");
		Thread.sleep(2000);
		//Auto.quit();
		 * 
		 * 
*/		
		
		
		//Auto Auto=new Auto();create object with the help of object reference call the methods
		//Declare every method as static and call with Classname.methodname -static way
		
		Auto.openBrowser("chrome");
		
		Thread.sleep(2000);
		
		Auto.openAppUrl("https://www.facebook.com");
		Thread.sleep(2000);
		
		Auto.enterText("//input[@name='firstname']","Rushi");
		Thread.sleep(2000);
		
		Auto.enterText("//input[@name='lastname']", "Lakkam");
		Thread.sleep(2000);
		
		Auto.selectByIndex("//select[@id='day']", 6);
		Thread.sleep(2000);
		
		Auto.selectByVisibleText("//select[@id='month']", "Aug");
		Thread.sleep(2000);
		
		Auto.selectByValue("//select[@id='year']", "11");
		Thread.sleep(2000);
		
		Auto.clickOn("//input[id='u_0_a']");
		Thread.sleep(2000);
		
		Auto.browserClose();
		
		
		
		

	}

}
