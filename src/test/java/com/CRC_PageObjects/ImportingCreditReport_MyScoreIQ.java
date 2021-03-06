package com.CRC_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;
import com.CRC_Reading_Values.Reading_Values;

public class ImportingCreditReport_MyScoreIQ extends AbstractClass
{
	@FindBy(how = How.XPATH, using = "//div[@id='sourcecodebox']")
	static WebElement ImportCreditReportPageContainer;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ui-dialog-title-sourcecodebox']")
	static WebElement ImportCreditReportText;
	
	@FindBy(how = How.XPATH, using = "//div[@id='autoreportimport']//a[@class='vediopopup'][normalize-space()='Watch a quick video']")
	static WebElement WatchQuickVideoLink;
	
	@FindBy(how = How.XPATH, using = "//div[@id='autoreportimport']//a[contains(text(),'Back')]")
	static WebElement BackButton;
	
	@FindBy(how = How.XPATH, using = "//select[@id='auto_selprovider']")
	static WebElement ChooseSupportProviderDropDown;
	
	@FindBy(how = How.XPATH, using = "//input[@id='auto_vcr_username']")
	static WebElement Username;
	
	@FindBy(how = How.XPATH, using = "//input[@id='auto_vcr_password']")
	static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//input[@id='auto_vcr_phonenumber']")
	static WebElement PhoneNumber;
	
	@FindBy(how = How.XPATH, using = "//input[@id='auto_vcr_securityword']")
	static WebElement SecurityWord;
	
	@FindBy(how = How.XPATH, using = "//input[@id='auto_vcr_note']")
	static WebElement Notes;
	
	@FindBy(how = How.XPATH, using = "//a[@id='auto_btnsubmit_with_pending']")
	static WebElement ImportReportAndRunSimpleAuditButton;
	
	@FindBy(how = How.XPATH, using = "//a[@id='auto_btnsubmit_without_pending']")
	static WebElement IdontNeedAnAuditJustImportLink;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Continue with the available report']")
	static WebElement ContineWithAvailableReportLink;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']")
	static WebElement HomePageLink;
	
	@FindBy(how = How.XPATH, using = "//div[@id='auto_error_div']")
	static WebElement ErrorMessageContainer;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='\"Login Failure! Please check access details.\"']")
	static WebElement LoginFailureMessage;
	
	
	public ImportingCreditReport_MyScoreIQ(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getImportCreditReportPageContainer()
	{
		waitForElement(ImportCreditReportPageContainer);
		TestAssert.verifyElementVisible(ImportCreditReportPageContainer);
		return ImportCreditReportPageContainer;
	}
	
	public WebElement getImportCreditReportText()
	{
		waitForElement(ImportCreditReportText);
		TestAssert.verifyElementVisible(ImportCreditReportText);
		return ImportCreditReportText;
	}
	
	public WebElement getWatchQuickVideoLink()
	{
		waitForElement(WatchQuickVideoLink);
		TestAssert.verifyElementVisible(WatchQuickVideoLink);
		return WatchQuickVideoLink;
	}
	
	public WebElement getBackButton()
	{
		waitForElement(BackButton);
		TestAssert.verifyElementVisible(BackButton);
		return BackButton;
	}
	
	public WebElement getChooseSupportProviderDropDown()
	{
		waitForElement(ChooseSupportProviderDropDown);
		TestAssert.verifyElementVisible(ChooseSupportProviderDropDown);
		select_dropdown_by_value(ChooseSupportProviderDropDown, "MyScoreIQ");
		return ChooseSupportProviderDropDown;
	}
	
	public WebElement getUsername()
	{
		waitForElement(Username);
		TestAssert.verifyElementVisible(Username);
		send_text(Username, Reading_Values.prop.getProperty("MyScoreIQUsername"));
		return Username;
	}
	
	public WebElement getPassword()
	{
		waitForElement(Password);
		TestAssert.verifyElementVisible(Password);
		send_text(Password, Reading_Values.prop.getProperty("MyScoreIQPassword"));
		return Password;
	}
	
	public WebElement getPhoneNumber()
	{
		waitForElement(PhoneNumber);
		TestAssert.verifyElementVisible(PhoneNumber);
		return PhoneNumber;
	}
	
	public WebElement getSecurityWord()
	{
		waitForElement(SecurityWord);
		TestAssert.verifyElementVisible(SecurityWord);
		send_text(SecurityWord, Reading_Values.prop.getProperty("MyScoreSSN"));
		return SecurityWord;
	}
	
	public WebElement getNotes()
	{
		waitForElement(Notes);
		TestAssert.verifyElementVisible(Notes);
		return Notes;
	}
	
	public WebElement getImportReportAndRunSimpleAuditButton()
	{
		waitForElement(ImportReportAndRunSimpleAuditButton);
		TestAssert.verifyElementVisible(ImportReportAndRunSimpleAuditButton);
		click(ImportReportAndRunSimpleAuditButton);
		return ImportReportAndRunSimpleAuditButton;
	}
	
	public WebElement getErrorMessageContainer()
	{
		waitForElement(ErrorMessageContainer);
		TestAssert.verifyElementVisible(ErrorMessageContainer);
		
		if (LoginFailureMessage.isDisplayed())
		{
			System.out.println(LoginFailureMessage.getText());		
		}else
		{
			waitForElement(ContineWithAvailableReportLink);
			TestAssert.verifyElementVisible(ContineWithAvailableReportLink);
			click(ContineWithAvailableReportLink);
			return ContineWithAvailableReportLink;	
		}	
		return ErrorMessageContainer;
	}
	
	public WebElement getIdontNeedAnAuditJustImportLink()
	{
		waitForElement(IdontNeedAnAuditJustImportLink);
		TestAssert.verifyElementVisible(IdontNeedAnAuditJustImportLink);
		return IdontNeedAnAuditJustImportLink;
	}
	
//	public WebElement getContineWithAvailableReportLink()
//	{
//		waitForElement(ContineWithAvailableReportLink);
//		TestAssert.verifyElementVisible(ContineWithAvailableReportLink);
//		click(ContineWithAvailableReportLink);
//		return ContineWithAvailableReportLink;
//	}
	public WebElement getReturnHomePage()
	{
		waitForElement(HomePageLink);
		TestAssert.verifyElementVisible(HomePageLink);
		click(HomePageLink);
		return HomePageLink;
	}
}
