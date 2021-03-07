package assessment_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_88.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://leafground.com/pages/Dropdown.html");

	//	WebElement mselect = driver.findElementByXPath("(//div[@class='example'])[6]");
		// Select options = new Select(mselect);

		// options.selectByValue("2");
		// options.selectByValue("4");

		WebElement app = driver.findElementByXPath("(//option[text()='Appium'])[6]");
		WebElement load = driver.findElementByXPath("(//option[text()='Loadrunner'])[6]");
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(app).click(load).keyUp(Keys.CONTROL).perform();
		
		
	}

}
