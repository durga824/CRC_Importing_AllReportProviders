package com.CRC_PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;
import com.CRC_Reading_Values.Reading_Values;

import junit.framework.Assert;

public class AddNewClient_Page extends AbstractClass
{
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Add a New Client']")
	static WebElement AddNewClientLink;
	
	@FindBy(how = How.XPATH, using = "//div[@class='indata']")
	static WebElement AddNewClientPageContainer;
	
	@FindBy(how = How.XPATH, using = "//div[@class='content1']")
	static WebElement AddClientText;
	
	@FindBy(how = How.XPATH, using = "//a[@id='vediopopup']")
	static WebElement WatchAquickVideoLink;
	
	@FindBy(how = How.ID, using = "fname")
	static WebElement FirstName;
	
	@FindBy(how = How.ID, using = "lname")
	static WebElement LastName;
	
	@FindBy(how = How.ID, using = "chknoemail")
	static WebElement EmailCheckBox;
	
	@FindBy(how = How.ID, using = "sub_button")
	static WebElement SubmitButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='jconfirm-box']")
	static WebElement WarningPopUpContainer;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='OK']")
	static WebElement WarningOkButton;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Cancel']")
	static WebElement WarningCancelButton;
	
	
	
	
	public AddNewClient_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getAddNewClientPage()
	{
		String AddNewClientURL= "https://qa.creditrepaircloud.com/myclients/add?from=home";
		Assert.assertEquals(AddNewClientURL, driver.getCurrentUrl());
	}
	
	public WebElement getAddNewClientLink()
	{
		waitForElement(AddNewClientLink);
		TestAssert.verifyElementVisible(AddNewClientLink);
		click(AddNewClientLink);
		return AddNewClientLink;
	}
	
	public WebElement getAddNewClientPageContainer()
	{
		waitForElement(AddNewClientPageContainer);
		TestAssert.verifyElementVisible(AddNewClientPageContainer);
		return AddNewClientPageContainer;
	}
	
	public WebElement getAddClientText()
	{
		waitForElement(AddClientText);
		TestAssert.verifyElementVisible(AddClientText);
		return AddClientText;
	}
	
	public WebElement getWatchAquickVideoLink()
	{
		waitForElement(WatchAquickVideoLink);
		TestAssert.verifyElementVisible(WatchAquickVideoLink);
		return WatchAquickVideoLink;
	}
	
	public WebElement getFirstName()
	{
		waitForElement(FirstName);
		TestAssert.verifyElementVisible(FirstName);
		send_text(FirstName, Reading_Values.prop.getProperty("FirstName"));
		return FirstName;
	}
	
	public WebElement getLastName()
	{
		waitForElement(LastName);
		TestAssert.verifyElementVisible(LastName);
		send_text(LastName, Reading_Values.prop.getProperty("Lastname"));
		return LastName;
	}
	
	public WebElement getEmailCheckBox()
	{
		waitForElement(EmailCheckBox);
		TestAssert.verifyElementVisible(EmailCheckBox);
		click(EmailCheckBox);
		return EmailCheckBox;
	}
	
	public WebElement getSubmitButton()
	{
		waitForElement(SubmitButton);
		TestAssert.verifyElementVisible(SubmitButton);
		click(SubmitButton);
		return SubmitButton;
	}
	
	public WebElement getWarningPopUpContainer()
	{
		waitForElement(WarningPopUpContainer);
		TestAssert.verifyElementVisible(WarningPopUpContainer);
		return WarningPopUpContainer;
	}
	
	public WebElement getWarningOkButton()
	{
		waitForElement(WarningOkButton);
		TestAssert.verifyElementVisible(WarningOkButton);
		click(WarningOkButton);
		return WarningOkButton;
	}
	
	public WebElement getWarningCancelButton()
	{
		waitForElement(WarningCancelButton);
		TestAssert.verifyElementVisible(WarningCancelButton);
		return WarningCancelButton;
	}
}
