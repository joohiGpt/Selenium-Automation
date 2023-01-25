package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Signup {
	
	public static void main (String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", " C:\\Users\\Abhishek\\OneDrive\\Desktop\\Jar_files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Parent p = new child (webDriver is parent & ChromeDriver is child)
		
		//Maximize the Chrome window to full-screen
		driver.get("https://twitter.com/i/flow/signup");
		
		driver.manage().window().maximize();

		//Explicit wait for 60 seconds, to find the webelement. You can increase or decrease the time as per your specification.        
		new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login-email"))));
		driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[1]")).sendKeys("joohi@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div")).click();
		
		/*
		//Click on Sign up with phone or email button]
		
	    driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]")).click();
	    WebElement web_element = driver.findElement(By.name("name"));
	    web_element.sendKeys("Joohi Gupta");
	    WebElement web_element_1 = driver.findElement(By.name("phone_number"));
	    web_element_1.sendKeys("7903834648");
	 
	    
 //	    WebElement end_user_1 =driver.findElement(By.name("phone_number"));
//	    end_user_1.sendKeys("12345677899");
	   
	    //Select drpmonth = new Select(driver.findElement(By.id("SELECTOR_4")));
	    //drpmonth.selectByVisibleText("January");
	    
	    
	    WebElement testDropDown = driver.findElement(By.id("SELECTOR_4"));  
	    Select dropdown = new Select(testDropDown); 
	    dropdown.selectByValue("1");
	    */
	    driver.close(); 


	}
}	
