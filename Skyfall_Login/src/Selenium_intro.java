
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_intro {

	public static void main(String[] args) {
		
// Invoke the Browser
//WebDriver methods + class methods = driver object
	    //ChromeDriver driver = new ChromeDriver(); // created object (driver) of ChromeDriver class

//WebDriver methods only for driver object, 
//cause different browser should also be able to access all the methods therefore we use WeDriver instead of ChromeDriver.
// selenium invokes chromedriver.exe to launch chrome browser
// selenium manager helps to eliminate to download the chromedriver .exe
System.setProperty("webdriver.chrome.driver", "/Users/RuhiHussain/OneDrive - Xperate Limited/Documents/Sdoc/chromedriver.exe");// this is now optional cause of selenium manager
         WebDriver driver = new ChromeDriver();		
        //ChromeOptions chromeOptions = new ChromeOptions();
		//WebDriverManager.chromedriver().browserVersion("111.0.5563.65").setup();
		//WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://ces-skyfall-qa.herokuapp.com/login");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
//driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");
		
//driver.close();
	}

}
