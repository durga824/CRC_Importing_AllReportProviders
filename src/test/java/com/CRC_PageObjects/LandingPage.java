package com.CRC_PageObjects;
import org.openqa.selenium.WebDriver;
import com.CRC_Reading_Values.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.CRC_Helper.AbstractClass;
import com.CRC_Helper.TestAssert;
import junit.framework.Assert;

public class LandingPage extends AbstractClass
{
	@FindBy(how = How.CLASS_NAME, using="new-login")
	static WebElement pageContainer;
	
	@FindBy(how = How.CLASS_NAME, using="new-login-left-box")
	static WebElement loginSection;
	
	@FindBy(how = How.XPATH, using = "//img[@src='https://qa.creditrepaircloud.com/application/images/cloud_logo.png']")
	static WebElement CRC_Logo;
	
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Team Member Login']")
	static WebElement TeamMemberLogin_text;
	
	@FindBy(how = How.ID, using="username")
    static WebElement username;

    @FindBy(how = How.ID, using="password")
    static WebElement password;

    @FindBy(how = How.ID, using="signin")
    static WebElement loginButton;
    
    @FindBy(how = How.ID, using="forgotpassword")
    static WebElement forgotpassword;
    
    
    
    
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPageContainer()
	{
		waitForElement(pageContainer);
		TestAssert.verifyElementVisible(pageContainer);
		return pageContainer;
	}
	
	public WebElement getLoginSection()
	{
		waitForElement(loginSection);
		TestAssert.verifyElementVisible(loginSection);
		return loginSection;
	}
	
	public WebElement getCRCLogo()
	{
		waitForElement(CRC_Logo);
		TestAssert.verifyElementVisible(CRC_Logo);
		return CRC_Logo;
	}
	
	public WebElement getTeamMemberLogingText()
	{
		String actTeamMemberLoginText = "Team Member Login";
		waitForElement(TeamMemberLogin_text);
		Assert.assertEquals(TeamMemberLogin_text.getText(), actTeamMemberLoginText);
		return TeamMemberLogin_text;
	}
	
	public WebElement getUserName()
	{
		waitForElement(username);
		send_text(username, Reading_Values.prop.getProperty("LoginUsername"));
		return username;
	}
	
	public WebElement getPassword()
	{
		waitForElement(password);
		send_text(password, Reading_Values.prop.getProperty("LoginPassword"));
		return password;
	}
	
	public WebElement getLoginButton()
	{
		waitForElement(loginButton);
		TestAssert.verifyElementVisible(loginButton);
		loginButton.click();
		return loginButton;
	}

}
