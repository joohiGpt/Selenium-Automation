package facebook;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args)throws InterruptedException { 
		System.setProperty("Webdriver.chrome.driver", " C:\\Users\\Abhishek\\OneDrive\\Desktop\\Jar_files\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
	      //disable notification parameter
	      op.addArguments("--disable-notifications");
	      // configure options parameter to Chrome driver
	      WebDriver driver = new ChromeDriver(op);
	 driver.get("https://www.facebook.com/login/");
	 driver.manage().window().maximize();
		 
	 driver.findElement(By.id("email")).sendKeys("abhi.neosoft@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("test12345#");
	 
	 driver.findElement(By.id("loginbutton")).click();
	 Thread.sleep(1000);
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@name='mercurymessages']")));

// click on user id
     driver.findElement(By.xpath("//*[@id=\"mount_0_0_X6\"]/div[1]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[2]/span/div/a/span/svg/path")).click();
// click on friends tab
     driver.findElement(By.xpath("//*[@id=\"mount_0_0_X6\"]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[4]/a/div[1]/div[2]/div[2]/div/div/i")).click();

// get parent element of friends table
   WebElement elmFriendsList = driver.findElement(By.xpath("//div[@id='timeline-medley']//ul[@data-pnref='friends']"));

// get list friends from friends table
List<WebElement> elmLst = elmFriendsList.findElements(By.xpath("//div[@class='fsl fwb fcb']"));

// initialize Action Class
Actions act = new Actions(driver);

// start a flag variable to find end of friends list
boolean itsNotEnd = true;

// use while loop to load all friends
while (itsNotEnd) {

 // get the last friend element in loaded friends list
 WebElement lastElem = elmLst.get(elmLst.size() - 1);

 // Move to last friend element so that it will load some friends
 act.moveToElement(lastElem).build().perform();

 // wait for 2 seconds to load friends
 Thread.sleep(2000);

 // get the updated friends list in same variable
 elmLst = elmFriendsList.findElements(By.xpath("//div[@class='fsl fwb fcb']"));

 // get the new last friend element
 WebElement nLastElem = elmLst.get(elmLst.size() - 1);

 // verify that the new last friend and last friend from previous list are same
 // if they are same change flag value to false
 // it false the while gets exit
 if (lastElem.equals(nLastElem)) {
  itsNotEnd = false;
 }
}

// print names of all friends
for (WebElement fr : elmLst) {
 System.out.println(fr.getText());
}
	}

}
