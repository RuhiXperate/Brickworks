//
//public class MultiClicks {
//
//	public static void main(String[] args) {
//		
//		//get Url
//		//get web element
//		//example            - Adult +  (1)
//		// you want          - Adult +  (5) by clicking "+" 4 times
//		
//		driver.findElement(By.id("divpaxinfo")).click();
//
//		   Thread.sleep(2000L);
//
//		   /*int i=1;
//
//		while(i<5)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();//4 times
//
//		i++;
//
//		}*/
//two methods --- when loop or for loop -- both can be used.
//		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		for(int i=1;i<5;i++)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//
//		driver.findElement(By.id("btnclosepaxoption")).click();
//
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
//
//	}}