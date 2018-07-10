import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class currency_17 {
	public static void main(String[] args) {
		
	}

@Test

	public void launchBrowser() {
		System.setProperty("WebDriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
		driver.findElement(By.xpath("//a[@id='to_sc']")).sendKeys("INR");
		driver.findElement(By.xpath("//button[@value='Convert']")).click();
		
		
	}
}
