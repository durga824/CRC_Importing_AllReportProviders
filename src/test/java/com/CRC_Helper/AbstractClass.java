package com.CRC_Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractClass 
{
	public static WebDriver driver;
	public static WebElement ele;
	public static WebDriverWait wait;
	public static String value;
	public static JavascriptExecutor js;
	
	public void send_text(WebElement ele, String value)
	{
		ele.sendKeys(value);
	}
	
	public void click(WebElement ele)
	{
		ele.click();
	}
	
	public void waitForElement(WebElement ele)
	{
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(ele));	
	}
	
	public void submit(WebElement ele) 
	{
        ele.submit();
    }
	
	public void select_dropdown_by_value(WebElement ele, String valueToChoose)
	{
	    Select s = new Select(ele);
	    waitForElement(ele);
	    s.selectByVisibleText(valueToChoose);
    }	
}
