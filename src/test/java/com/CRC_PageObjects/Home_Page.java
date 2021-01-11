package com.CRC_PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;

public class Home_Page extends AbstractClass
{
	 @FindBy(how = How.CLASS_NAME, using = "contentbg")
	 static WebElement homePageContainer;

	 @FindBy(how = How.ID, using="activeclientlink")
     static WebElement activeClientsLink;

	 @FindBy(how = How.ID, using="affilatelink")
	 static WebElement affiliatesLink;

	 @FindBy(how = How.ID, using="leadslink")
	 static WebElement leadsLink;

	 @FindBy(how = How.ID, using="clientsuccesslink")
	 static WebElement clientSuccessLink;

	 @FindBy(how = How.XPATH, using = "//div[@class='chleftbox']//a[contains(text(),'View Dashboard')]")
	 static WebElement viewDashboardLink;

	 @FindBy(how = How.ID, using="charttitle")
	 static WebElement chartTitle;

	 @FindBy(how = How.ID, using="linechart")
	 static WebElement lineChart;
	 
	 @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[5]/div[1]/div[5]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
	 static WebElement QuickStartContainer;
	 
	 @FindBy(how = How.XPATH, using = "//strong[normalize-space()='Quick Start']")
	 static WebElement QuickStartTitle;
	 
	 @FindBy(how = How.XPATH, using = "//span[normalize-space()='Add a New Client']")
	 static WebElement AddNewClientLink;
	 
	 @FindBy(how = How.XPATH, using = "//span[normalize-space()='Select an Existing Client']")
	 static WebElement SelectAnExistingClientLink;
	 
	 @FindBy(how = How.XPATH, using = "//span[normalize-space()='Run Credit Dispute Wizard']")
	 static WebElement RunCreditDisputeWizard;
	 
	 @FindBy(how = How.XPATH, using = "//div[@id = 'todolist']")
	 static WebElement MyTasksContainer;
	 
	 @FindBy(how = How.XPATH, using = "//strong[normalize-space()='My Tasks']")
	 static WebElement MyTasksText;
	 
	 @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[1]/a[1]")
	 static WebElement NewTaskLink;
	 
	 @FindBy(how = How.XPATH, using = "//td[@align='left']//div[@class='chrightbox']")
	 static WebElement RightSide_Container;
	 
	 @FindBy(how = How.XPATH, using = "//body/div[@class='containerin']/div[@class='contentleftin']/div[@class='contentbg']/div[@class='clink1bg']/div[7]")
	 static WebElement RecentLoginActivityContainer;
	 
	 
	 
	 public Home_Page(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);		 
	 }
	 
	 public WebElement gethomePageContainer()
	 {
		 waitForElement(homePageContainer);
		 TestAssert.verifyElementVisible(homePageContainer);
		 return homePageContainer;
	 }
	 
	 public WebElement getActiveClientLink()
	 {
		 waitForElement(activeClientsLink);
		 TestAssert.verifyElementVisible(activeClientsLink);
		 click(activeClientsLink);
		 return activeClientsLink;
	 }
	 
	 public WebElement getAffiliatesLink()
	 {
		 waitForElement(affiliatesLink);
		 TestAssert.verifyElementVisible(affiliatesLink);
		 click(affiliatesLink);
		 return affiliatesLink;
	 }
	 
	 public WebElement getLeadsLink()
	 {
		 waitForElement(leadsLink);
		 TestAssert.verifyElementVisible(leadsLink);
		 click(leadsLink);
		 return leadsLink;
	 }
	 
	 public WebElement getclientSuccessLink()
	 {
		 waitForElement(clientSuccessLink);
		 TestAssert.verifyElementVisible(clientSuccessLink);
		 click(clientSuccessLink);
		 return clientSuccessLink;
	 }
	 
	 public WebElement getviewDashboardLink()
	 {
		 waitForElement(viewDashboardLink);
		 TestAssert.verifyElementVisible(viewDashboardLink);
		 click(viewDashboardLink);
		 driver.navigate().back();
		 return viewDashboardLink;
	 }
	 
	 public WebElement getchartTitle()
	 {
		 waitForElement(chartTitle);
		 TestAssert.verifyElementVisible(chartTitle);
		 return chartTitle;
	 }
	 
	 public WebElement getlineChart()
	 {
		 waitForElement(lineChart);
		 TestAssert.verifyElementVisible(lineChart);
		 return lineChart;
	 }
	 
	 public WebElement getQuickStartContainer()
	 {
		 waitForElement(QuickStartContainer);
		 TestAssert.verifyElementVisible(QuickStartContainer);
		 return QuickStartContainer;
	 }
	 
	 public WebElement getQuickStartTitle()
	 {
		 waitForElement(QuickStartTitle);
		 TestAssert.verifyElementVisible(QuickStartTitle);
		 return QuickStartTitle;
	 }
	 
	 public WebElement getAddNewClientLink()
	 {
		 waitForElement(AddNewClientLink);
		 TestAssert.verifyElementVisible(AddNewClientLink);
		 click(AddNewClientLink);
		 driver.navigate().back();
		 return AddNewClientLink;
	 }
	 
	 public WebElement getSelectAnExistingClientLink()
	 {
		 waitForElement(SelectAnExistingClientLink);
		 TestAssert.verifyElementVisible(SelectAnExistingClientLink);
		 click(SelectAnExistingClientLink);
		 driver.navigate().back();
		 return SelectAnExistingClientLink;
	 }
	 
	 public WebElement getRunCreditDisputeWizard()
	 {
		 waitForElement(RunCreditDisputeWizard);
		 TestAssert.verifyElementVisible(RunCreditDisputeWizard);
		 click(RunCreditDisputeWizard);
		 driver.navigate().back();
		 return RunCreditDisputeWizard;
	 }
	 
	 public WebElement getMyTasksContainer()
	 {
		 waitForElement(MyTasksContainer);
		 TestAssert.verifyElementVisible(MyTasksContainer);
		 return MyTasksContainer;
	 }
	 
	 public WebElement getMyTasksText()
	 {
		 waitForElement(MyTasksText);
		 TestAssert.verifyElementVisible(MyTasksText);
		 return MyTasksText;
	 }
	 
	 public WebElement getNewTaskLink()
	 {
		 waitForElement(NewTaskLink);
		 TestAssert.verifyElementVisible(NewTaskLink);
		 return NewTaskLink;
	 }
	 
	 public WebElement getRightSide_Container()
	 {
		 waitForElement(RightSide_Container);
		 TestAssert.verifyElementVisible(RightSide_Container);
		 return RightSide_Container;
	 }
	 
	 public WebElement getRecentLoginActivityContainer()
	 {
		 waitForElement(RecentLoginActivityContainer);
		 TestAssert.verifyElementVisible(RecentLoginActivityContainer);
		 return RecentLoginActivityContainer;
	 }
	 
}
