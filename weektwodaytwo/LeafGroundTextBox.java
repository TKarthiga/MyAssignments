package weektwodaytwo;// done

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundTextBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Type your name
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Karthiga");
		//Append Country to this City
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		//Verify if text box is disabled
		WebElement disabledTextBox = driver.findElement(By.xpath("//div/input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"));
		boolean enabled = disabledTextBox.isEnabled();
		System.out.println("Is the given textbox is enabled: "+ enabled);
		//Clear the typed text
		driver.findElement(By.xpath("(//div/input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).clear();
		//Retrieve the typed text
		WebElement retriveText = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String text = retriveText.getAttribute("value");
		System.out.println(text);
		Thread.sleep(3000);
		//Type email and Tab. Confirm control moved to next element
		WebElement emailId = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		emailId.sendKeys("Karthigaece35@gmail.com");
		emailId.sendKeys(Keys.TAB);
		//Type about yourself
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("I am karthiga");
		//Text Editor
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("GoodMorning");
		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		 WebElement element = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		 String text2 = element.getText();
		 System.out.println(text2);
		//Click and Confirm Label Position Changes
		 Point loc1 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		 Point loc2 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
		 if(loc1==loc2) {
			 System.out.println("Label position doesnt change");
		 }else {
			 System.out.println("Label position changed");
		 }
			 
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//label[text()='Username']")).sendKeys(Keys.ENTER);
		 // Type your name and choose the third option 
		 WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		 element2.sendKeys("Karthiga");
		 driver.findElement(By.xpath("//li[text()='3']")).click();
		 //Click and Confirm Keyboard appears 
		 driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		boolean displayed = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		System.out.println("Keyboard is dispalyed: "+displayed);
		//Custom Toolbar
		 driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		 driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Welcome to Selenium Learning");
		 driver.close();
	}

}
