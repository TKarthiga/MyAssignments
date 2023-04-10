package weektwodaytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String t1 = driver.getTitle();
		System.out.println("Title of current webpage is: "+ t1);
		driver.navigate().back();
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(enabled==true) {
			System.out.println("The button is enabled");
		}else {
			System.out.println("The button is disabled");
		}
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']")).getLocation();
		System.out.println("Location of submit button is :"+ location);
		driver.close();
	}

}
