

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OneApp {
	/*@Test
	public static void OneAppLogin() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://192.168.1.150");	
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\'userid\']")).sendKeys("admin");
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='pswrd']")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[text()= 'CX-48 CX3002 VNC-66,COM24  [10.100.97.48]']")).click();
		//driver.findElement(By.xpath("//*[text()='CX3002 - 46 (Lap2, COM7)  [10.100.97.46]']")).click();
	}
	@Test
	public static void OneAppAddDevice() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.150:80");
		driver.manage().window().maximize(); //to maximize the window
		driver.findElement(By.id("userid")).sendKeys("admin");
		driver.findElement(By.name("pswrd")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click(); //log in click
		Thread.sleep(30000);
	    //System.out.println(driver.findElement(By.cssSelector("span#logstatus")).getText()); //if we enter wrong Pwrd, prints msg
		
		driver.findElement(By.xpath("//img[@id='img_add']")).click(); //to click add device
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Multiple Devices']")).click();
		//driver.findElement(By.xpath("//*[@id=\'txtIpAddress\']")).sendKeys("10.100.97.40");  // to add single IP.
		driver.findElement(By.xpath("//*[@id=\'txtFromIpAddress\']")).sendKeys("10.100.97.40"); //to add ip in from when we select multiple IP
		driver.findElement(By.xpath("//*[@id=\'txtToIpAddress\']")).sendKeys("10.100.97.50");				
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.className("short-user")).click();
		//System.out.println(driver.getCurrentUrl()); 
		//driver.findElement(By.cssSelector("#img_add")).click();
		driver.findElement(By.cssSelector("#btnAddDevice")).click();
	}*/
	@Test
	public static void oneappNewconfig() throws InterruptedException 
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://192.168.1.150:80");
	driver.manage().window().maximize();
	driver.findElement(By.id("userid")).sendKeys("admin");
	driver.findElement(By.name("pswrd")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click(); //log in click
	Thread.sleep(10000);
	WebElement dashboard =  driver.findElement(By.xpath("//span[@title='Dashboard']"));
	Actions a = new Actions(driver);
	a.moveToElement(dashboard).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
}
