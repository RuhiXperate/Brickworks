package Map_Selection_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class OrderBy {

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
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "Brickworks Site Manager");

// Order By Dropdown for checking sort.
		WebElement orderBy = driver.findElement(By.xpath("//select[@aria-label='Order by']"));
		// Select is a class of selenium having various methods for handling dropdowns.
		Select dropdown = new Select(orderBy);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByIndex(4);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();
		
	}

}
