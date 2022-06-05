package com.chek.pagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.chek.pages.HomePage;
import com.chek.setups.Setups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HomePageTest {
    private WebDriver driver;
    private HomePage browser;
    private Setups setups = new Setups();

	@BeforeMethod
	public void setUp() {
        setups.setPropertyOS();
        driver = new FirefoxDriver();
        this.browser = new HomePage(driver);
        setups.homePageSetup(driver);
    }

	@AfterMethod
	public void tearDown() {
        driver.quit();
    }

   





}
