package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import systemTime.getSystemTimeDemo;

public class ScreenShotDemo2 {

	WebDriver driver;
	@Test
	public void googleTest(){
	System.setProperty("webdriver.chrome.driver","D://Chromedriver//Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		takeSnapShotDemo(driver,"google.png");
				
	}
	@Test
	 public void takeSnapShotDemo(WebDriver file, String status){
		 TakesScreenshot screenShot = (TakesScreenshot)driver;
	File src = (File)screenShot.getScreenshotAs(OutputType.FILE);
		 String folderName = getSystemTimeDemo.getDate();
		 
		String timeStamp =  getSystemTimeDemo.getTimeStamp();
		
		try{
			
			FileUtils.copyFile(src, new File(".//"+folderName+"//" + file + "_" + timeStamp + "_"  + status + ".png"));
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		
	 }
	
	
	
}
