package weektwodaytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//label[text()='Edge'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		WebElement element = driver.findElement(By.xpath("((//input[@checked='checked'])[4]/following::label)[1]"));
		String text = element.getText();
		System.out.println(text);
		//(//input[@checked='checked'])[4]/following::label
		driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4']/div[@class])[6]")).click();
		driver.close();
	}

}
