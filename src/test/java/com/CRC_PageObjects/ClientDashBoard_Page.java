package com.CRC_PageObjects;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;

import junit.framework.Assert;

public class ClientDashBoard_Page extends AbstractClass
{
	@FindBy(how = How.XPATH, using = "//div[@class='indata']")
	static WebElement ClientDashBoardPageContainer;
	
	@FindBy(how = How.XPATH, using = "//div[@class='client']")
	static WebElement ClientSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='project']")
	static WebElement ScoresSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='paperwork']")
	static WebElement DocumentsSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='statuscontent']")
	static WebElement DisputeStausSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='reminder']")
	static WebElement TasksSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='memo showAreadblClick']")
	static WebElement MemoSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='invoice']")
	static WebElement InvoicesSection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='assigncontactbg']")
	static WebElement ContactsAssignedSection;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='1-Click Import and Audit']")
	static WebElement OneClickImportAndAuditButton;
	
	
	
	public ClientDashBoard_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getClientDashBoard_Page()
	{
		String ClientDashBoardURL = "";
		Assert.assertEquals(ClientDashBoardURL, driver.getCurrentUrl());
	}
	
	public WebElement getClientDashBoardPageContainer()
	{
		waitForElement(ClientDashBoardPageContainer);
		TestAssert.verifyElementVisible(ClientDashBoardPageContainer);
		return ClientDashBoardPageContainer;
	}
	
	public WebElement getClientSection()
	{
		waitForElement(ClientSection);
		TestAssert.verifyElementVisible(ClientSection);
		return ClientSection;
	}
	
	public WebElement getScoresSection()
	{
		waitForElement(ScoresSection);
		TestAssert.verifyElementVisible(ScoresSection);
		return ScoresSection;
	}
	
	public WebElement getDocumentsSection()
	{
		waitForElement(DocumentsSection);
		TestAssert.verifyElementVisible(DocumentsSection);
		return DocumentsSection;
	}
	
	public WebElement getDisputeStausSection()
	{
		waitForElement(DisputeStausSection);
		TestAssert.verifyElementVisible(DisputeStausSection);
		return DisputeStausSection;
	}
	
	public WebElement getTasksSection()
	{
		waitForElement(TasksSection);
		TestAssert.verifyElementVisible(TasksSection);
		return TasksSection;
	}
	
	public WebElement getMemoSection()
	{
		waitForElement(MemoSection);
		TestAssert.verifyElementVisible(MemoSection);
		return MemoSection;
	}
	
	public WebElement getInvoicesSection()
	{
		waitForElement(InvoicesSection);
		TestAssert.verifyElementVisible(InvoicesSection);
		return InvoicesSection;
	}
	
	public WebElement getContactsAssignedSection()
	{
		waitForElement(ContactsAssignedSection);
		TestAssert.verifyElementVisible(ContactsAssignedSection);
		return ContactsAssignedSection;
	}
	
	public WebElement getOneClickImportAndAuditButton()
	{
		waitForElement(OneClickImportAndAuditButton);
		TestAssert.verifyElementVisible(OneClickImportAndAuditButton);
		click(OneClickImportAndAuditButton);
		return OneClickImportAndAuditButton;
	}
	

}
