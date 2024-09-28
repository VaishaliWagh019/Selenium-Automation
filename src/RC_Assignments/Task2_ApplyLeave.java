package RC_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_ApplyLeave
{	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		//open orangehrm portal
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
        Thread.sleep(2000);
        //Enter username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);
        //Enter Password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);
        //Click login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        //click LEave button
        driver.findElement(By.linkText("Leave")).click();
        Thread.sleep(2000);
        //Click Apply button
        driver.findElement(By.linkText("Apply")).click();
        Thread.sleep(2000);
        //select the dropdown
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]")).click();
        Thread.sleep(2000);
        //select the value
        driver.findElement(By.xpath("//*[contains(text(), 'CAN')]")).click();
        Thread.sleep(2000);
        //enter from date
        driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[1]")).sendKeys("2024-16-09");
        Thread.sleep(2000);
        //Delete the date from To date field which is getting auto filled
        driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[2]")).sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.DELETE));
        Thread.sleep(2000);
        // Enter To date
        driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[2]")).sendKeys("2024-20-09");
		Thread.sleep(2000);
		//Enter comment
		driver.findElement(By.xpath("//textarea[@class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")).sendKeys("Leave Request");
		Thread.sleep(2000);
		//Click Apply button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		Thread.sleep(2000);
		
        
	}

}
