package assessment_01;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.jsoup.select.Evaluator.ContainsOwnText;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2_Assessment {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_88.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.javatpoint.com/");

		driver.findElementByXPath("(//p[text()='Cucumber'])[1]").click();

		String text = driver.findElementByXPath("//h1[@class='h1']").getText();
		System.out.println(text);

		File scrshot = driver.getScreenshotAs(OutputType.FILE);
		File shop = new File("./snaps/img.JPEG");
		FileUtils.copyFile(scrshot, shop);

		driver.findElementByXPath("(//a[@class='next'])[1]").click();

		driver.findElementByXPath("//a[text()='Behavior Driven Development']").click();

		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println(title);

		if (title ==  Contains("Introduction to Cucumber")) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

	}

	private static String Contains(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
