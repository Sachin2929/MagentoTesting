
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class MagentoTest 
{
	@Test
	public void login() throws InterruptedException 
	{ 
		ChromeDriver cd = new ChromeDriver();		
//		cd.manage().window().maximize();	
		cd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cd.get("https://www.magento.com");
		Welcome w = new Welcome(cd);
		w.clickOnMyAcc();
		Thread.sleep(5000);		
		
		Login l = new Login(cd);
		l.clickOnSend();		
		Thread.sleep(5000);		
				
//		Home h = new Home(cd);
//		h.clickOnLogout();
//		Thread.sleep(5000);
//		cd.quit();
	}

}
