package com.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Baseconfig;
import com.util.HighLiter;

public class BaseLogin {


	public void getLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Baseconfig.getValue("URL"));
		driver.manage().window().maximize();

		MasterPageFactory mpf = new MasterPageFactory(driver);
		HighLiter.getColor(mpf.getName(), driver);
		mpf.getName().sendKeys(Baseconfig.getValue("name"));
		HighLiter.getColor(mpf.getPassword(), driver, "green");
		mpf.getPassword().sendKeys(Baseconfig.getValue("password"));
		mpf.getLoginbut().click();
		mpf.getLogoutbut().click();
		System.out.println( driver.getCurrentUrl());
		driver.quit();

		
		/*WebElement name = driver.findElement(By.xpath("//*[@id= 'name']"));
		WebElement password = driver.findElement(By.xpath("//*[@id= 'password']"));
		WebElement Loginbut = driver.findElement(By.xpath("//*[@id= 'login']"));
		WebElement Logoutbut = driver.findElement(By.xpath("//*[@id='logout']"));
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.findElement(By.className("sign-up")).isDisplayed());
		System.out.println(driver.findElement(By.className("sign-up")).isEnabled());
		System.out.println(driver.findElement(By.className("sign-up")).isSelected());*/

		
	}


}
