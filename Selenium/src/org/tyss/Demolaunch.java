package org.tyss;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// avoid unnecessary methods
		driver.manage().window().maximize();// method chaining to maximize page
		// driver.navigate().to("https://www.google.com/");//any url can be given to
		// display page
		// driver.get("https://www.youtube.com/?gl=IN");//any url can be given to
		// display page
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);// to close page after 2sec
		driver.navigate().back();
		Thread.sleep(2000);// to close page after 2sec
		driver.navigate().forward();// to go forward after cmng back
		Thread.sleep(2000);// to close page after 2sec
		driver.navigate().refresh();
		String title = driver.getTitle();// to refresh again after loading page
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		// driver.quit();
		String parent = driver.getWindowHandle();//getting the parent
		System.out.println(parent);
		Thread.sleep(2000);
	
		Set<String> wins = driver.getWindowHandles();//parent along with child
		/*Thread.sleep(2000);
		wins.remove(parent);//removing the parent
		for (String win : wins) {
			System.out.println(win + "c");
			Thread.sleep(2000);
			
			driver.switchTo().window(win).close();//closing the child one by one		
			//driver.close();//to close page automatically
*/
			/*ArrayList<String> lst = new ArrayList<>(wins);//to close tabs in reverse
			for(int i=lst.size()-1;i>=0;i--)
			{
				driver.switchTo().window(lst.get(i)).close();

		}
		or
		*/
		ArrayList<String> lst = new ArrayList<>();//to close tabs in reverse
		lst.addAll(wins);
		for(int i=lst.size()-1;i>=0;i--)
		{
			driver.switchTo().window(lst.get(i)).close();

	}

	}

}
