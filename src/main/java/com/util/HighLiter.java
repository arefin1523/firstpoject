package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLiter {

	public static void getColor(WebElement element, WebDriver driver) {

		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public static void getColor(WebElement element, WebDriver driver,String color ) {

		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='6px solid "+color+"'", element);

	}



}
