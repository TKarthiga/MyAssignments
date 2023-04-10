package weektwodaytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 2: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 3: Maximise the window
		driver.manage().window().maximize();
		// Step 4: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Step 5: Click on Create New Account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		// Step 6: Enter the first name
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Karthiga");
		// Step 7: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Thangavel");
		// Step 8: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9715215385");
		// Step 9: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("Karthi@123");
		// Step 10: Handle all the three drop downs
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select d1 = new Select(day);
		d1.selectByIndex(2);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m1 = new Select(month);
		m1.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y1 = new Select(year);
		y1.selectByVisibleText("1992");
		// Step 11: Select the radio button "Female" 
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		driver.close();
	}

}
