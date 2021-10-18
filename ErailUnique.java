package week3.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[@title='Chennai Egmore']")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[@title='Bangalore East']")).click();
		Thread.sleep(3000);
		List<WebElement> trainList = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));
		System.out.println("the list size is "+trainList.size());
		Set<String> tList = new HashSet<String>();
		for (WebElement webElement : trainList) {
			String text = webElement.getText();
			tList.add(text);

		}
		System.out.println("the set size is "+tList.size());

	}

}
