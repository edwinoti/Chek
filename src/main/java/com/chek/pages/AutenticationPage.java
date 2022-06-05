package com.chek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class AutenticationPage {
    private WebDriver driver;
   

    public AutenticationPage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void clickButtonSignIn() {
        driver.findElement(By.xpath("/html//div[@id='__next']/div[@class='main-container']//a[@href='/en/ng/auth/login']")).click();
    }

   

    public void loginCheckElementsIsDisplayed() {
        WebElement formLogin = driver.findElement(By.xpath("//*[@id=\"Loginbox\"]/div/div/div/div/div[2]"));
        formLogin.isDisplayed();
        formLogin.findElement(By.name("email")).isDisplayed();
        formLogin.findElement(By.name("password")).isDisplayed();
        //formLogin.findElement(By.id("ForgetPassword")).isDisplayed();
        formLogin.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
    }

    public void loginCheckTextElements() {
        WebElement formLogin = driver.findElement(By.xpath("//*[@id=\\\"Loginbox\\\"]/div/div/div/div/div[2]"));
        assertEquals("Log In",formLogin.findElement(By.xpath("/html//div[@id='__next']/div[@class='main-container']//h1[.='Log In']")).getText());
        assertEquals("Forgot password",formLogin.findElement(By.id("/html//div[@id='__next']/div[@class='main-container']/div[@class='main-wrapper']//form[@action='#']//p[.='Forgot Password']")).getText());
        assertEquals("Sign in",formLogin.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/form/div[4]/button")).getText());
    }

   

//    public void checkLoginErrorMessages(String expectedText) {
//        assertEquals(expectedText, driver.findElement(By.xpath("/html//div[@id='Loginbox']/div/div//ul/li[.='Invalid UserName and Password']")).getText());
//    }

    public void fillSignInEmailField(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void fillSignInPasswordField(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }
    
    public void clickButtonLogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void checkLoginName() {
        assertEquals("Edwin Oti", driver.findElement(By.className("account")).getText());
    }
}
