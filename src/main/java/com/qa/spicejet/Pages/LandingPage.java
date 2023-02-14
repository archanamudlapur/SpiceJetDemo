package com.qa.spicejet.Pages;

import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.border.TitledBorder;

public class LandingPage extends TestBase {
    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement LoginBtn;
    @FindBy(xpath="//div[contains(text(),'Signup')]")
    WebElement SignUpBtn;
    @FindBy(xpath="//div[contains(text(),'flight status')]")
    WebElement FlightStatus;
    @FindBy(xpath="//div[text()='Departure Date']")
    WebElement FlightStatusdate;
    @FindBy(xpath="//div[text()='Today']")
    WebElement Todaybtn;
    @FindBy(xpath="//div[text()='From']")
    WebElement FRM;
    @FindBy(xpath="//div[text()='Bengaluru']")
    WebElement blore;
    @FindBy(xpath="//div[text()='To']")
    WebElement To;
    @FindBy(xpath="//div[text()='Delhi']")
    WebElement Delhi;
    @FindBy(xpath = "//input[@class='css-1cwyjr8 r-homxoj r-1i10wst r-1eimq0t r-mk0yit r-xfkzu9 r-lnhwgy']")
    WebElement FlightNum;
    @FindBy(xpath="//div[ @class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
    WebElement SearchFlights;
    @FindBy(xpath="//div[contains(text(),'Add-ons')]")
    WebElement AddOns;
    @FindBy(xpath="//div[contains(text(),'SpiceMAX')]")
    WebElement Spicemax;

    public static String DateVal="24-02-2023";

    public LandingPage(){
        PageFactory.initElements(driver,this);
    }
    public String GetTitle(){
        return driver.getTitle();
    }
   public LoginPage LandingPageLogin(){
        LoginBtn.click();
        return new LoginPage();
   }
   public SignUpPage LandingPageSignUp(){
       SignUpBtn.click();
       return new SignUpPage();
   }
   public SpicePage AddOnsOption(){
       Windowhandles.ActionClass(AddOns);
       Spicemax.click();
       return new SpicePage();
   }
   public void FlightStatus()  {
        FlightStatus.click();
        FlightStatusdate.click();
        Todaybtn.click();
        FRM.click();
        blore.click();
        To.click();
        To.click();
        Delhi.click();
        FlightNum.sendKeys("24567SE");
        SearchFlights.click();
        SearchFlights.click();

   }





}
