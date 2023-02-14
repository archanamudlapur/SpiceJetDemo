package com.qa.spicejet.Pages;

import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SignUpPage extends TestBase {
    @FindBy(xpath = "//Select[@class='form-control form-select ']")
    WebElement Select;
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstname;
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastname;
    @FindBy(xpath = "//select[@class='form-control form-select']")
    WebElement Country;
    @FindBy(xpath = "//input[@id='dobDate']")
    WebElement DOBdate;
    @FindBy(xpath = "//input[@type='tel']")
    WebElement mobnum;
    @FindBy(xpath = "//input[@id='email_id']")
    WebElement Emailid;
@FindBy(xpath = "//input[@id='new-password']")
WebElement password;
    @FindBy(xpath = "//input[@id='c-password']")
    WebElement Confirmpass;
    @FindBy(xpath = "//input[@id='defaultCheck1' and @class='form-check-input mt-02']")
    WebElement Checkbox;
    @FindBy(xpath = "//button[text()='Submit']")
    WebElement Submit;


    public SignUpPage() {

        PageFactory.initElements(driver, this);
    }

    public String GetSignUpPageTitle(){

        return driver.getTitle();
    }
    public void FillDetailsSignUp(String First_Name,String Last_Name,String DOB, String MobNum,String pass, String Cpass) throws InterruptedException {
       Select select=new Select(Select);
        select.selectByVisibleText("Ms");
        firstname.sendKeys(First_Name);
        lastname.sendKeys(Last_Name);
        Select select1=new Select(Country);
        select1.selectByVisibleText("India");
        DOBdate.sendKeys(DOB);
        mobnum.sendKeys(MobNum);
       // Emailid.click();
       // Thread.sleep(2000);
       // Emailid.sendKeys(EmailId);
       // Actions actions = new Actions(driver);
       // actions.click(Emailid).sendKeys("archana@gmail.com").build().perform();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10000));
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_id")));
        emailField.sendKeys("archana@gmail.com");
        password.sendKeys(pass);
        Confirmpass.sendKeys(Cpass);
        Windowhandles.Js(driver,Checkbox);
       // Submit.click();

    }








}