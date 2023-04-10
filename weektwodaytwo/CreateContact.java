package weektwodaytwo;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Tharun");
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Adithya");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Tharun");
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Adhi");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("This is my department");
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("Welcome to new department");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("(//input[@class='inputBox'])[15]")).sendKeys("tharun12@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select e1 = new Select(element);
		e1.selectByVisibleText("New York");
		//Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated note");
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
