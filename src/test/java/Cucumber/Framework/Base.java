package Cucumber.Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				"D:\\Madhu\\Workspace\\Automation\\src\\test\\java\\Cucumber\\Framework\\global.properties");
		// System.getProperty("user.dir" +
		// "\\src\\test\\java\\Cucumber\\Framework\\global.properties"));
		prop = new Properties();
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "D:\\Madhu\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		return driver;
	}

}
