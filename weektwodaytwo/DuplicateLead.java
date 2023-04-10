package weektwodaytwo; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[3]")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("karthiga1@gmail.com");
		 driver.findElement(By.xpath("(//em[@unselectable='on']/button[@class='x-btn-text'])[7]")).click();
		 Thread.sleep(2000);
		 WebElement leadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext'])[1]"));
		 String l1 = leadName.getText();
		 System.out.println("Name of First Resulting lead is " + l1);
		 WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]"));
		leadId.click();
		
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a[@class='subMenuButton'])[1]")).click();
		WebElement leadTitle = driver.findElement(By.xpath("//div[@class='x-panel-tc']/div[@class='x-panel-header sectionHeaderTitle']"));
		String title = leadTitle.getText();
		System.out.println("The title is " + title);
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(4000);
		WebElement duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp"));
		String leadName1 = duplicateLeadName.getText();
		System.out.println("Duplicated lead name is " + leadName1);
		if(leadName1.equalsIgnoreCase(l1)) {
			System.out.println("The duplicated lead is same as captured lead name");
			
		}else {
			System.out.println("Lead names are not matching");
	}
		driver.close();
}
}
