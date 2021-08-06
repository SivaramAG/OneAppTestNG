import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logins 
	{
	@Test
	public static void viewer() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.150");
		driver.findElement(By.id("userid")).sendKeys("viewer");
		driver.findElement(By.xpath("//*[@name='pswrd']")).sendKeys("viewer");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@id='img_add']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtIpAddress']")).sendKeys("10.100.97.45");
		driver.findElement(By.cssSelector("#btnAddDevice")).click();
	}

	@Test
	public static void operator() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\softwares\\setup of selenium\\SE_FFOX\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.150");
		driver.findElement(By.id("userid")).sendKeys("operator");
		driver.findElement(By.xpath("//*[@name='pswrd']")).sendKeys("operator");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//img[@id='img_add']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtIpAddress']")).sendKeys("10.100.97.53");
		driver.findElement(By.cssSelector("#btnAddDevice")).click();
		driver.quit();
	}
}
