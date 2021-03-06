package assessment_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {

	public static void main(String[] args) {


	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver_88.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		
		WebElement mfashion = driver.findElementByXPath("(//span[@class='catText'])[6]");
		
		Actions build = new Actions(driver);
		build.moveToElement(mfashion).perform();
		
		driver.findElementByXPath("//span[text()='Loafers']").click();
		
		WebElement firstele = driver.findElementByXPath("(//div[@class='product-tuple-image '])[1]");
		build.moveToElement(firstele).perform();
		firstele.click();
		
		driver.quit();
	}

}
