package objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkartHomepage {
	
	WebDriver driver;
	public flipkartHomepage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search= By.xpath("//*[@title='Search for products, brands and more']");
	By click= By.className("L0Z3Pu");
	//By values= By.xpath("//div[@class='col col-5-12 nlI3QM'] //div[@class='_30jeq3 _1_WHN1']");
	//By price= By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]");
	//By price=By.xpath("(\"//div[@class='_30jeq3 _1_WHN1']\")[2]");
	//By price=By.xpath("(\"//div[@class='_25b18c'] //div[@class='_30jeq3 _1_WHN1']\") [1]");
	//By price=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]");
	By price=By.xpath("//a[@class='_1fQZEK']/div[2]/div[2]/div[1]/div/div");
	public WebElement Search() {
		return driver.findElement(search);
	}
	public WebElement Click() {
		return driver.findElement(click);
	}
	
	/*public List<WebElement> Values() {
		return driver.findElements(values);
	}*/
	public WebElement Price() {
		return driver.findElement(price);
	}

}
