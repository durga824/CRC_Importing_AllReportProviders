package com.CRC_Base;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import com.CRC_Reading_Values.*;
import com.CRC_PageObjects.AddNewClient_Page;
import com.CRC_PageObjects.ClientDashBoard_Page;
import com.CRC_PageObjects.ClientDeletion;
import com.CRC_PageObjects.Home_Page;
import com.CRC_PageObjects.ImportCreditReport_IdentityIq;
import com.CRC_PageObjects.ImportCreditReport_PrivacyGuard;
import com.CRC_PageObjects.ImportCreditReport_SmartCredit;
import com.CRC_PageObjects.ImportingCreditReport_MyFreeScoreNow;
import com.CRC_PageObjects.ImportingCreditReport_MyScoreIQ;
import com.CRC_PageObjects.LandingPage;


public class Main_CRC extends Reading_Values
{
	public static WebDriver driver;

	@BeforeTest
	public static void Landing_Page() throws ParserConfigurationException, SAXException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Durga\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("QaUrl"));
		LandingPage landing = new LandingPage(driver);
		landing.getPageContainer();
		landing.getLoginSection();
		landing.getCRCLogo();
		landing.getTeamMemberLogingText();
		landing.getUserName();
		landing.getPassword();
		landing.getLoginButton();
	}

	@Test(priority = 0)
	public void HomePage() {
//		HOME_PAGE
		Home_Page home = new Home_Page(driver);
		home.gethomePageContainer();
		home.getActiveClientLink();
		home.getAffiliatesLink();
		home.getclientSuccessLink();
		home.getLeadsLink();
		home.getviewDashboardLink();
		home.getchartTitle();
		home.getlineChart();
		home.getQuickStartContainer();
		home.getQuickStartTitle();
		home.getAddNewClientLink();
		home.getSelectAnExistingClientLink();
		home.getRunCreditDisputeWizard();
		home.getMyTasksContainer();
		home.getMyTasksText();
		home.getNewTaskLink();
		home.getRightSide_Container();
		home.getRecentLoginActivityContainer();
		driver.quit();

	}

	public void AddClient() throws Throwable {
//		ADD NEW CLIENT PAGE		
		AddNewClient_Page addClient = new AddNewClient_Page(driver);
		addClient.getAddNewClientLink();
		addClient.getAddNewClientPage();
		addClient.getAddNewClientPageContainer();
		addClient.getAddClientText();
		addClient.getWatchAquickVideoLink();
		addClient.getFirstName();
		addClient.getLastName();
		addClient.getEmailCheckBox();
		addClient.getSubmitButton();
		addClient.getWarningPopUpContainer();
		addClient.getWarningCancelButton();
		addClient.getWarningOkButton();
		Thread.sleep(10000);
	}

	public void ClientDeletion() throws Throwable {
//		DELETING CLIENT
		ClientDeletion delete = new ClientDeletion(driver);
		delete.getMyClientsButton();
		delete.getAdvancedSearchField();
		delete.getSearchMyClientText();
		delete.getSearchButton();
		Thread.sleep(5000);
		delete.getDeleteOption();
		delete.getWarningPopUpContainer();
		delete.getInactiveThisClientButton();
		delete.getDeleteThisClientButton();
	}

	public void DashBoardPage() {
//		CLIENT DASHBOARD PAGE
		ClientDashBoard_Page dashboard = new ClientDashBoard_Page(driver);
		dashboard.getClientDashBoardPageContainer();
		dashboard.getClientSection();
		dashboard.getScoresSection();
		dashboard.getDocumentsSection();
		dashboard.getDisputeStausSection();
		dashboard.getTasksSection();
		dashboard.getMemoSection();
		dashboard.getInvoicesSection();
		dashboard.getContactsAssignedSection();
		dashboard.getOneClickImportAndAuditButton();
	}

	@Test(priority = 1)
	public void Importing_IdentityIqReport() throws Throwable {
		Landing_Page();
		AddClient();
		DashBoardPage();
		ImportCreditReport_IdentityIq importreportIdiq = new ImportCreditReport_IdentityIq(driver);
		importreportIdiq.getImportCreditReportPageContainer();
		importreportIdiq.getImportCreditReportText();
		importreportIdiq.getWatchQuickVideoLink();
		importreportIdiq.getBackButton();
		importreportIdiq.getChooseSupportProviderDropDown();
		importreportIdiq.getUsername();
		importreportIdiq.getPassword();
		importreportIdiq.getPhoneNumber();
		importreportIdiq.getSecurityWord();
		importreportIdiq.getNotes();
		importreportIdiq.getIdontNeedAnAuditJustImportLink();
		importreportIdiq.getImportReportAndRunSimpleAuditButton();
		Thread.sleep(90000);
		importreportIdiq.getReturnHomePage();
		ClientDeletion();
		driver.quit();
	}

	@Test(priority = 2)
	public void Importing_SmartCredit() throws Throwable {
		Landing_Page();
		ImportCreditReport_SmartCredit smartcredit = new ImportCreditReport_SmartCredit(driver);
		AddClient();
		DashBoardPage();
		smartcredit.getImportCreditReportPageContainer();
		smartcredit.getImportCreditReportText();
		smartcredit.getWatchQuickVideoLink();
		smartcredit.getBackButton();
		smartcredit.getChooseSupportProviderDropDown();
		smartcredit.getUsername();
		smartcredit.getPassword();
		smartcredit.getPhoneNumber();
//		smartcredit.getSecurityWord();
		smartcredit.getNotes();
		smartcredit.getIdontNeedAnAuditJustImportLink();
		smartcredit.getImportReportAndRunSimpleAuditButton();
		smartcredit.getContineWithAvailableReportLink();
		Thread.sleep(90000);
		smartcredit.getReturnHomePage();
		ClientDeletion();
		driver.quit();
	}

	@Test(priority = 3)
	public void Importing_PrivacyGuard() throws Throwable {
		Landing_Page();
		ImportCreditReport_PrivacyGuard privacyGuard = new ImportCreditReport_PrivacyGuard(driver);
		AddClient();
		DashBoardPage();
		privacyGuard.getImportCreditReportPageContainer();
		privacyGuard.getImportCreditReportText();
		privacyGuard.getWatchQuickVideoLink();
		privacyGuard.getBackButton();
		privacyGuard.getChooseSupportProviderDropDown();
		privacyGuard.getUsername();
		privacyGuard.getPassword();
		privacyGuard.getPhoneNumber();
		privacyGuard.getSecurityWord();
		privacyGuard.getNotes();
		privacyGuard.getIdontNeedAnAuditJustImportLink();
		privacyGuard.getImportReportAndRunSimpleAuditButton();
//		privacyGuard.getErrorMessageContainer();
//		privacyGuard.getContineWithAvailableReportLink();
		Thread.sleep(90000);
		privacyGuard.getReturnHomePage();
		ClientDeletion();
		driver.quit();
	}

	@Test(priority = 4)
	public void Importing_MyfreeScoreNow() throws Throwable {
		Landing_Page();
		ImportingCreditReport_MyFreeScoreNow myfreeScoreNow = new ImportingCreditReport_MyFreeScoreNow(driver);
		AddClient();
		DashBoardPage();
		myfreeScoreNow.getImportCreditReportPageContainer();
		myfreeScoreNow.getImportCreditReportText();
		myfreeScoreNow.getWatchQuickVideoLink();
		myfreeScoreNow.getBackButton();
		myfreeScoreNow.getChooseSupportProviderDropDown();
		myfreeScoreNow.getUsername();
		myfreeScoreNow.getPassword();
		myfreeScoreNow.getPhoneNumber();
		myfreeScoreNow.getNotes();
		myfreeScoreNow.getIdontNeedAnAuditJustImportLink();
		myfreeScoreNow.getImportReportAndRunSimpleAuditButton();
		myfreeScoreNow.getErrorMessageContainer();
	}

//	@Test(priority = 5)
//	public void Importing_MyScoreIq() throws Throwable {
//		ImportingCreditReport_MyScoreIQ myscireiq = new ImportingCreditReport_MyScoreIQ(driver);
//		AddClient();
//		DashBoardPage();
//		myscireiq.getImportCreditReportPageContainer();
//		myscireiq.getImportCreditReportText();
//		myscireiq.getWatchQuickVideoLink();
//		myscireiq.getBackButton();
//		myscireiq.getChooseSupportProviderDropDown();
//		myscireiq.getUsername();
//		myscireiq.getPassword();
//		myscireiq.getPhoneNumber();
//		myscireiq.getSecurityWord();
//		myscireiq.getNotes();
//		myscireiq.getIdontNeedAnAuditJustImportLink();
//		myscireiq.getImportReportAndRunSimpleAuditButton();
//		myscireiq.getErrorMessageContainer();
//
//		Thread.sleep(90000);
//
//	}
}
