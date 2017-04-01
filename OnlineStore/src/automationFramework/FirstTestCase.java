package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTestCase {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		//String URL = "https://www.flipkart.com" ;
		//System.setProperty("webdriver.gecko.driver","D:\\\\Selenium\\selenium-java-3.3.1\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\selenium-java-3.3.1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//Launch Browser
		driver.get("http://www.lowes.com");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='scontainer']/div/header/div[2]/div/ul/li[3]/ul/li/ul/li[2]/ul/li[2]/a/span"));
	
	
		
System.out.println("Successfully opened the website www.store.demoqa.com");
Thread.sleep(5000);
driver.quit();
	}

}
