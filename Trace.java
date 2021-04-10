package trick;

import org.openqa.selenium.chrome.ChromeDriver;

public class Trace {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 
		
		/*System.setProperty("webdriver.chrome.silentOutput", "true"); */
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://studyabroad.shiksha.com/"); 
		
		driver.manage().window().maximize(); 

		
	
		
		
	}
}