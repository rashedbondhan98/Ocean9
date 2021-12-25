package advancedElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select s =new Select(dropDown);
		//select by index
		s.selectByIndex(1);
		Thread.sleep(5000);
		//select by values
		s.selectByValue("2");
		Thread.sleep(5000);
		//select by visible text
		s.selectByVisibleText("option 1");
		
	}

}
