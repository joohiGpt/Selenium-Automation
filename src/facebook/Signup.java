package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver", " C:\\Users\\Abhishek\\OneDrive\\Desktop\\Jar_files\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/signup");
		  driver.manage().window().maximize();
		 driver.findElement(By.name("firstname")).sendKeys("Joohi");
		 driver.findElement(By.name("lastname")).sendKeys("Gupta");
		 driver.findElement(By.name("reg_email__")).sendKeys("joohi@gmail.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("joohi@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Joohi@1234");
		 Select Days =new Select(driver.findElement(By.name("birthday_day")));
		 Days.selectByValue("2");
	     Thread.sleep(1000);
		 Select Month =new Select(driver.findElement(By.name("birthday_month")));
     	 Month.selectByValue("1");
		 Thread.sleep(1000);
		 Select Year =new Select(driver.findElement(By.name("birthday_year")));
		 Year.selectByValue("1990");

		//driver.findElement(By.name("sex")).click();
		//driver.findElement(By.xpath("sex")).click();
		driver.findElement(By.name("sex")).click();
 		 driver.findElement(By.name("websubmit")).click();
 	
		 }
}