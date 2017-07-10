import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		driver=new FirefoxDriver();
        driver.manage().window().maximize();
 //       WebDriverWait wait = new WebDriverWait(driver, 5000);
		
		driver.get("https://search.yahoo.com");
		driver.findElement(By.id("yschsp")).clear();
		driver.findElement(By.id("yschsp")).sendKeys("psych");
		driver.findElement(By.id("bd")).click();
		driver.findElement(By.cssSelector("button.sbb")).click();
		Assert.assertEquals(driver.getTitle(), "psych - Yahoo Search Results");
	}

}
