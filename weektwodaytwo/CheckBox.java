package weektwodaytwo; //done

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Ajax']/preceding-sibling::div)[2]")).click();
		driver.findElement(By.xpath("//*[text()='Python']")).click();
		driver.findElement(By.xpath("//*[text()='C-Sharp']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div/div[@class='ui-chkbox ui-widget'])[1]"));
		element.click();
		element.click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		boolean enabled = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']")).isEnabled();
		if(enabled!=true) {
			System.out.println("Button is disabled");
		}
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Brasilia'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		driver.close();
	}

}
