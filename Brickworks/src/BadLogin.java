import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BadLogin {

	public static void main(String[] args) {
		
		// Chrome version independent script.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		// get Brickworks URL
		driver.get("https://ces-skyfall-qa.herokuapp.com/login");

		//Login incorrectly
		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi5+qa@xperate.com");
	    driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']")).sendKeys("123Abc!@#");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='form-group alert errorMsg']")).getText());
		

	}

}
