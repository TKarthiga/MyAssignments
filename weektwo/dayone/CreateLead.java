package weektwo.dayone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.className("inputBox")).sendKeys("XYZ Company");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthiga");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Karthiga T");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ABCD Department");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to New Lead");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthiga1@gmail.com");
	
	WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select s = new Select(element);
	s.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	}

}
