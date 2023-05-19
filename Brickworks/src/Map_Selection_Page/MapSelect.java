package Map_Selection_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MapSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
// get Brickworks URL
		driver.get("https://ces-skyfall-qa-manager.azurewebsites.net/login");
		System.out.println(driver.getTitle());
				
				
// Login perfectly
		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");
	    driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']")).sendKeys("123Abc!@#");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
// search by entering value in search field		
		WebElement search = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		search.click();
		search.sendKeys("Mets");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='map-selection-item__wrapper'])[1]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
// Searching by parent map grid.
		driver.navigate().back();
		Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='maps-grid'] //div[normalize-space()='Mets Win the World Series']")).click();
Thread.sleep(1000);
driver.close();
	}

}
