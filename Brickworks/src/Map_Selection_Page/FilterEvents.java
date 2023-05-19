package Map_Selection_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class FilterEvents {

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		
//// get Brickworks URL
//		driver.get("https://ces-skyfall-qa-manager.azurewebsites.net/login");
//		System.out.println(driver.getTitle());
//		
//		
//// Login perfectly
//		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");
//	    driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']")).sendKeys("123Abc!@#");
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		Thread.sleep(1000);
//		System.out.println(driver.getCurrentUrl());
//		Thread.sleep(1000);
//		Assert.assertEquals(driver.getTitle(), "Brickworks Site Manager");
//		
//// Filter Events by Presenter
//		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//		Thread.sleep(2000);
//		
////click on presenters field
//		driver.findElement(By.xpath("(//input[@class='form-multi-select-search'])[1]")).click();
//			Thread.sleep(1000);
//
//			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='form-multi-select-option form-multi-select-option-with-checkbox']"));
//
//			for (int i = 0; i < elements.size(); i += 2) {
//
//			elements.get(i).click();
//
//			Thread.sleep(1000);
//
//
//			}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-link btn-small btn-link-light']")).click();
//		}
//
//		
//	}

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		// get Brickworks URL

		driver.get("https://ces-skyfall-qa-manager.azurewebsites.net/login");

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Email']")).sendKeys("ruhi+qa@xperate.com");

		driver.findElement(By.xpath("//div[@class='login-form']//input[@placeholder='Password']")).sendKeys("123Abc!@#");

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		Thread.sleep(1000);

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(1000);

		Assert.assertEquals(driver.getTitle(), "Brickworks Site Manager");

		// Filter Events by Presenter

		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='form-multi-select-search'])[1]")).click();

		Thread.sleep(1000);

		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='form-multi-select-option form-multi-select-option-with-checkbox']"));

		System.out.println(elements.size());

		for (int i = 1; i < elements.size()-3; i += 2) {

		elements.get(i).click();

		Thread.sleep(1000);

		}

		Thread.sleep(2000);

		//close presenters window

		driver.findElement(By.xpath("(//div[@class='form-multi-select form-multi-select-selection-tags'])[1]"));

		Thread.sleep(4000);

		// //cross icon to clear filter

		driver.findElement(By.className("form-multi-select-selection-cleaner")).click();

		//cross icon to close filters sidebar

		driver.findElement(By.className("map-selection-filter-close")).click();

		//clear filetrs

		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@class='btn btn-link btn-small btn-link-light']")).click();

		driver.close();
	}}
