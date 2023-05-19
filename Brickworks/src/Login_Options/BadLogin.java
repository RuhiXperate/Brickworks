package Login_Options;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class BadLogin {

	public static void main(String[] args) throws InterruptedException {
		
// Chrome version independent script.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
// get Brickworks URL and maximize the window
		driver.get("https://ces-skyfall-qa-manager.azurewebsites.net/login");
		driver.manage().window().maximize();

//Login incorrectly (Incorrect ID and Correct Password)
		WebElement email = driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']"));
		email.sendKeys("ruhi5+qa@xperate.com");
		WebElement password = driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']"));
		password.sendKeys("123Abc!@#");
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		String error_1 = (driver.findElement(By.cssSelector(".form-group.alert.errorMsg")).getText());
		System.out.println("1.Incorrect ID and Correct Password = " + error_1);
		Thread.sleep(3000);
		Assert.assertEquals(error_1, "The combination of Email and Password is incorrect.");
			
// Refresh the window for error msg 2
		driver.navigate().refresh();
		Thread.sleep(2000);
		
//Login incorrectly (Correct ID and missing Password)
		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String error_2 = (driver.findElement(By.cssSelector("li[class='errorMsg']")).getText());
		System.out.println("2.Correct ID and Missing Password = " + error_2);
		Thread.sleep(3000);
		Assert.assertEquals(error_2, "Please enter valid password");
		
// Refresh the window for error msg 3
		driver.navigate().refresh();
		Thread.sleep(2000);
		
//Login incorrectly (InCorrect ID and missing Password)
		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi1+qa@xperate.com");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String error_3 = (driver.findElement(By.cssSelector("li[class='errorMsg']")).getText());
		System.out.println("3.InCorrect ID and Missing Password = " + error_3);
		Thread.sleep(3000);
		Assert.assertEquals(error_3, "Please enter valid password");

// Refresh the window for error msg 4
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
//Hit Login without ID and Password.
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		List<WebElement> s = (driver.findElements(By.cssSelector(".form-group.alert.errorMsg")));
		
		 for(int i = 0; i< s.size(); i++) // iterate over list
	      
		 {
	         String error_4 = s.get(i).getText(); //obtain text
	         System.out.println("4.Login without ID and Password = " + error_4);
	         Thread.sleep(2000);
	 	    // Assert.assertEquals(error_4, "Please enter valid Email Please enter valid password");
	 		 
		 }
		
	driver.close();
	}
	
}