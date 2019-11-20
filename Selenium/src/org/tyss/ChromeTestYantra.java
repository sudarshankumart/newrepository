package org.tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestYantra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testyantra.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}

}
