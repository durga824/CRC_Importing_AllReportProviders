package com.CRC_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;

public class ClientDeletion extends AbstractClass
{
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='My Clients']")
	static WebElement MyClientsButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='sname']")
	static WebElement AdvancedSearchField;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Search My Clients')]")
	static WebElement SearchMyClientText;
	
	@FindBy(how = How.XPATH, using = "//td[@class='formboxtext normaltext1']//input[@value='Search']")
	static WebElement SearchButton;
	
	@FindBy(how = How.XPATH, using = "//img[@src='https://qa.creditrepaircloud.com/application/images/cross.png']")
	static WebElement DeleteOption;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[22]")
	static WebElement WarningPopUpContainer;
	
	@FindBy(how = How.XPATH, using = "//input[@id='inactive_client']")
	static WebElement InactiveThisClientButton;
	
	@FindBy(how = How.XPATH, using = "//input[@id='delete_client']")
	static WebElement DeleteThisClientButton;
	
	
	public ClientDeletion(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMyClientsButton()
	{
		waitForElement(MyClientsButton);
		TestAssert.verifyElementVisible(MyClientsButton);
		click(MyClientsButton);
		return MyClientsButton;
	}
	
	public WebElement getAdvancedSearchField()
	{
		waitForElement(AdvancedSearchField);
		TestAssert.verifyElementVisible(AdvancedSearchField);
		send_text(AdvancedSearchField, "Dummy Client");
		return AdvancedSearchField;
	}
	
	public WebElement getSearchMyClientText()
	{
		waitForElement(SearchMyClientText);
		TestAssert.verifyElementVisible(SearchMyClientText);
		return SearchMyClientText;
	}
	
	public WebElement getSearchButton()
	{
		waitForElement(SearchButton);
		TestAssert.verifyElementVisible(SearchButton);
		click(SearchButton);
		return SearchButton;
	}
	
	public WebElement getDeleteOption()
	{
		waitForElement(DeleteOption);
		TestAssert.verifyElementVisible(DeleteOption);
		click(DeleteOption);
		return DeleteOption;
	}
	
	public WebElement getWarningPopUpContainer()
	{
		waitForElement(WarningPopUpContainer);
		TestAssert.verifyElementVisible(WarningPopUpContainer);
		return WarningPopUpContainer;
	}
	
	public WebElement getInactiveThisClientButton()
	{
		waitForElement(InactiveThisClientButton);
		TestAssert.verifyElementVisible(InactiveThisClientButton);
		return InactiveThisClientButton;
	}
	
	public WebElement getDeleteThisClientButton() 
	{
		waitForElement(DeleteThisClientButton);
		TestAssert.verifyElementVisible(DeleteThisClientButton);
		click(DeleteThisClientButton);
		return DeleteThisClientButton;	
	}
}
