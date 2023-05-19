import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Webdriver is interface = boss who defines rules as in methods for all classes of chrome, firefox etc
		//System.setProperty("webdriver.chrome.driver", "/Users/RuhiHussain/OneDrive - Xperate Limited/Documents/Sdoc/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		// Chrome version independent script.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		// get Brickworks URL
		driver.get("https://ces-skyfall-qa.herokuapp.com/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Login perfectly
		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");
	    driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']")).sendKeys("123Abc!@#");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		

	}

}
