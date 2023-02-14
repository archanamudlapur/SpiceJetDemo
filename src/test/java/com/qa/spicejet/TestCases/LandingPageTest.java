package com.qa.spicejet.TestCases;

import com.qa.spicejet.Pages.Homepage;
import com.qa.spicejet.Pages.LandingPage;
import com.qa.spicejet.Pages.LoginPage;
import com.qa.spicejet.Pages.SignUpPage;
import com.qa.spicejet.TestBase.TestBase;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends TestBase {
LandingPage lp;
LoginPage login;
SignUpPage sp;
Homepage hp;
    public String DateVal="12-02-2023";
    public LandingPageTest(){

        super();
    }
    @BeforeMethod
    public void SetUp(){
        initialization();
        lp=new LandingPage();

    }
    @Test
    public void GetTitleTest(){
       String Title= lp.GetTitle();
        Assert.assertEquals(Title,"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
        System.out.println(Title);
    }
    @Test
    public void LandingPageSignUpTest(){

        sp= lp.LandingPageSignUp();

    }
    @Test
    public void LandingPageLoginTest(){

        login= lp.LandingPageLogin();
    }
    @Test
    public void AddonsTest(){
        lp.AddOnsOption();
    }

    @Test
    public void FlightStatusTest()  {
        lp.FlightStatus();
    }

    @AfterMethod
    public void TearDown(){
       driver.quit();
    }
}
