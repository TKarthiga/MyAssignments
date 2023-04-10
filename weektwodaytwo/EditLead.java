package weektwodaytwo;//done 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.xpath("(//li/a)[10]")).click();
		 driver.findElement(By.xpath(("(//div[@class='x-form-element']/input[@type='text'])[14]"))).sendKeys("Karthiga");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//em[@unselectable='on']/button[@class='x-btn-text'])[7]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		 String title = driver.getTitle();
		 System.out.println("Title of the page is "+ title);
		 driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a[@class='subMenuButton'])[3]")).click();
		 WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		 updateCompanyName.clear();
		 updateCompanyName.sendKeys("TCS Company");
		 driver.findElement(By.xpath("(//td/input[@type='submit'])[1]")).click();
		 WebElement companyName = driver.findElement(By.id("viewLead_companyName_sp"));
		 String text = companyName.getText();
		 System.out.println("Changed company name is "+ text);
		 driver.close();
	}

}
