package com.chek.setups;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.chek.pages.AutenticationPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setups {

    public void setPropertyOS(){
    	getPropertyForWindowsOS();
    }

    public void getPropertyForMacOS() {
		//System.setProperty("webdriver.gecko.driver","/home/METROPOL0/edwin.otieno/Documents/selenium_java_stuff/geckodriver");
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\edwin.o\\Documents\\selenium_java_stuff\\drivers\\geckodriver.exe");

    }
//
    public void getPropertyForWindowsOS() {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\edwin\\Desktop\\SeleniumJava\\drivers\\chromedriver");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\edwin.o\\Documents\\selenium_java_stuff\\drivers\\geckodriver.exe");

    }
    

    
    
    
    //site automated url link

    private void defaultSetup(WebDriver driver) {
        driver.get("https://marketplace.staging.myautochek.com/ng/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void homePageSetup(WebDriver driver) {
        defaultSetup(driver);
    }
    

  
    public void autenticationPageSetup(WebDriver driver, AutenticationPage browser) {
        defaultSetup(driver);
        browser.loginCheckElementsIsDisplayed();
    }
    
//    public void creditPageSetup(WebDriver driver, CreditPage browser) {
//        defaultSetup(driver);
//        browser.loginToRDD();
//    }


  
}
