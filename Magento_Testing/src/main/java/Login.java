import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;

	public Login(WebDriver driver) 
	{		
		this.driver = driver;
	}
	By mail=By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	By login=By.xpath("//button[@id='send2']");
	public void clickOnSend() throws InterruptedException 
	{
		driver.findElement(mail).sendKeys("kundansinghmahisour@gmail.com");
		Thread.sleep(5000);
		driver.findElement(pass).sendKeys("Welcome@123");
		Thread.sleep(5000);
		driver.findElement(login).click();
	}
}
