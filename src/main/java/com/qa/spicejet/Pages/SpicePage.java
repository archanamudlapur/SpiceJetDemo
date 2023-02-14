package com.qa.spicejet.Pages;

import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class SpicePage extends TestBase {
    @FindBy(xpath="//a[text()='ADD SPICEMAX TO YOUR BOOKING ']")
    WebElement Booking;

    public SpicePage(){
        PageFactory.initElements(driver,this);
    }

    public String GettitleSpice(){
        return driver.getTitle();
    }
    public PNRPage Booking(){
        Windowhandles.JsExecuteScroll(driver,Booking);
        Booking.click();
        return new PNRPage();
    }
}
