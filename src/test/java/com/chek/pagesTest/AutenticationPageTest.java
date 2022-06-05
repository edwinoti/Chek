package com.chek.pagesTest;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.chek.pages.AutenticationPage;
import com.chek.setups.Setups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import tests.builder.EmailBuilder;
//import tests.pages.AutenticationPage;
//import tests.setups.Setups;

public class AutenticationPageTest {
    private WebDriver driver;
    private AutenticationPage browser;
    private Setups setups = new Setups();

    
	@BeforeMethod
	public void setUp() {
        setups.setPropertyOS();
        driver = new FirefoxDriver();
        this.browser = new AutenticationPage(driver);
        setups.autenticationPageSetup(driver, browser);
    }

	@AfterMethod
	public void tearDown() {
        driver.quit();
    }


    @Test (priority=1)
    public void testNonRegisteredUserLogin_noEmailAndPassword_clickButtonSignIn() {
        browser.clickButtonSignIn();
      //  browser.checkLoginErrorMessages("There is 1 error\n" + "Login failed. Please check your username or email and password. Note that the password is case-sensitive.");
    }

    @Test(priority=2)
    public void testNonRegisteredUserLogin_emailNoPassword_clickButtonSignIn() {
    	browser.clickButtonSignIn();
        browser.fillSignInEmailField("edwin@gmail.com");
        browser.fillSignInPasswordField("");
        browser.clickButtonLogin();
        //browser.checkLoginErrorMessages("There is 1 error\n" + "Login failed. Please check your username or email and password. Note that the password is case-sensitive.");
    }


    @Test(priority=3)
    public void testNonRegisteredUserLogin_invalidEmailAndPassword_clickButtonSignIn() {
    	browser.clickButtonSignIn();
        browser.fillSignInEmailField("edwin@gmail.com");
        browser.fillSignInPasswordField("123456");
        browser.clickButtonLogin();
     //   browser.checkLoginErrorMessages("There is 1 error\n" + "Login failed. Please check your username or email and password. Note that the password is case-sensitive.");
    }

//    @Test(priority=4)
//    public void testNonRegisteredUserLogin_clickLinkForgotYourPassword() {
//        browser.clickLinkForgotYourPassword();
//    }


    @Test(priority=5)
    public void testAutenticationPage_signIn_sucessfuly() {
    	browser.clickButtonSignIn();
    	browser.fillSignInEmailField("edwinotieno27@gmail.com");
        browser.fillSignInPasswordField("press2014");
        browser.clickButtonSignIn();
    }
}
