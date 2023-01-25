package Task_1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.google.common.io.Files;

public class tweet {
	
	public static void main(String[] args) {

	System.setProperty("Webdriver.chrome.driver", " C:\\Users\\Abhishek\\OneDrive\\Desktop\\Jar_files\\chromedriver_win32\\chromedriver.exe");

	driver.get("https://twitter.com/blakeshelton");

	//Find the Tweet Box and enter the Tweet Hello World
	WebElement tweetBox = driver.findElement(By.id("tweet-box-home-timeline"));
	tweetBox.click();
	tweetBox.sendKeys("Hello World");

	//Click on Tweet Button
	driver.findElement(By.xpath(".//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']")).click();

	//Wait
	Thread.sleep(2000);

	// Take Screenshot for Evidence
	File srce = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	// Save the screenshot in the given path by the name Tweet.png
	Files.copy(srce, new File("/Users/abc/Desktop/Screenshots/Tweet.png"));

	//Click on Profile and Settings
	driver.findElement(By.id("user-dropdown-toggle")).click();

	//Wait and Click Logout Button
	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("signout-button")));
	logout.click();

	//Wait
	Thread.sleep(2000);

	// Close the browser
	driver.quit();

}
