package weektwodaytwo; 

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
	 driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
	 
	 driver.findElement(By.name("phoneNumber")).sendKeys("99");
	 driver.findElement(By.xpath("(//td[@class='x-panel-btn-td']/table)[6]")).click();
	 Thread.sleep(2000);
	 
	 WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]"));
	 String l1 = leadId.getText();
	 System.out.println("Lead ID of First Resulting lead "+l1);
	 leadId.click();
	 
	 driver.findElement(By.className("subMenuButtonDangerous")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@type='text'])[13]")).sendKeys(l1);
	 driver.findElement(By.xpath("(//em[@unselectable='on']/button[@class='x-btn-text'])[7]")).click();
	 WebElement errorMessage = driver.findElement(By.xpath("//div/div[@class='x-paging-info']"));
	 String t1 = errorMessage.getText();
	 System.out.println(t1);
	 driver.close();	 
	 
}
}
