import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTest 
{
	public static void main(String[] args) 
	{
		//configuring
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Guest\\workspace\\LaunchingBrowser\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//to get title
		String title=driver.getTitle();
		System.out.println(title);
		
		 //to find the location
		WebElement fd = driver.findElement(By.xpath("//input[@type='email']"));
		fd.sendKeys("anni83@GMAIL.COM");
		
		WebElement fd1=driver.findElement(By.xpath("//input[@type='password'][1]"));
		fd1.sendKeys("annie");
		
		WebElement btn=driver.findElement(By.xpath("//lable[@id='loginbutton']"));
		btn.click();
		
		driver.quit();
	}
}


