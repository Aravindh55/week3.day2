package week3.day3;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::label)[5]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		List<WebElement> bagBrand =driver.findElements(By.className("brand"));
		System.out.println(bagBrand.size());
		System.out.println("Available Bag Brands:");
		System.out.println("--------------------");
		for (WebElement webElement : bagBrand) {
			String text2 = webElement.getText();
			System.out.println(text2);
			
		}
		List<WebElement> bagNames=driver.findElements(By.className("name"));
		System.out.println("Available Bag Names:");
		System.out.println("--------------------");
		for (WebElement webElement : bagNames) {
			String text3 = webElement.getText();
			System.out.println(text3);
		}
		

	}

}
