package Task_1;

public class Profile {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", " C:\\Users\\Abhishek\\OneDrive\\Desktop\\Jar_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/blakeshelton");
		
		String followers = driver.findElement(By.xpath("//div[@class='ProfileCanopy-navBar']//li[@class='ProfileNav-item ProfileNav-item--followers']//span[@class='ProfileNav-value']")).getText();
		<a class="ProfileNav-stat ProfileNav-stat--link u-borderUserColor u-textCenter js-tooltip js-nav" data-nav="followers" tabindex="0" data-original-title="4,406,048 Followers">
	    <span class="ProfileNav-label">Followers</span>
	    <span class="ProfileNav-value" data-is-compact="true">4.41M</span>
	</a>
	
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-nav='followers']")));
	System.out.println(e.getAttribute("outerHTML"));
	System.out.println(e.getAttribute("title"));
	<a class="ProfileNav-stat ProfileNav-stat--link u-borderUserColor u-textCenter js-tooltip js-openSignupDialog js-nonNavigable u-textUserColor" title="14,189,678 Followers" data-nav="followers" href="/blakeshelton/followers">
    <span class="ProfileNav-label">Followers</span>
    <span class="ProfileNav-value" data-is-compact="true">14.2M</span>
</a>
//Wait
	Thread.sleep(2000);

	// Close the browser
	driver.quit();
	}

}
