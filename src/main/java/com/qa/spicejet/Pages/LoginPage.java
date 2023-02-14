package com.qa.spicejet.Pages;

import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath="//div[text()='Email']")
    WebElement emailradio;
    @FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4' and @type='email']")
    WebElement EmailIdinput;
    @FindBy(xpath="//input[@class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4' and @type='password']")
    WebElement passwordinput;
    @FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
    WebElement Login;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public String GetTitle(){
        return driver.getTitle();
    }

    public void FillDetails(String email,String pass) throws InterruptedException {
        emailradio.click();
        EmailIdinput.sendKeys(email);
        passwordinput.sendKeys(pass);
        Login.click();
        Thread.sleep(3000);
      //  Windowhandles.Alertclass();



    }
}
