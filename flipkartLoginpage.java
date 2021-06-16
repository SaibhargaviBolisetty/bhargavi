package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkartLoginpage {
	
	WebDriver driver;
	public flipkartLoginpage(WebDriver driver) {
		this.driver=driver;
	}
			
	By username=By.xpath(("//*[@class='_2IX_2- VJZDxU']"));
	By password=By.xpath("//*[@type='password']");
	By go=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	public WebElement EmailId() {
		return driver.findElement(username);
	}
	public WebElement Pwd() {
		return driver.findElement(password);
	}
	public WebElement Submit() {
		return driver.findElement(go);
	}

}
