package com.qa.spicejet.TestCases;

import com.qa.spicejet.Pages.LandingPage;
import com.qa.spicejet.Pages.PNRPage;
import com.qa.spicejet.Pages.SpicePage;
import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpicePageTest extends TestBase {
    LandingPage lp;
    SpicePage sp;
    PNRPage pnr;
    public  SpicePageTest(){
        super();
    }
    @BeforeMethod
    public void SetUp(){
        initialization();
        lp=new LandingPage();
        sp=new SpicePage();
      sp= lp.AddOnsOption();
        Windowhandles.GetWindowHandles();

    }
    @Test
    public void GettitleSpiceTest(){
     String Title=   sp.GettitleSpice();
        System.out.println(Title);
    }
    @Test
    public void BookingTest(){
     pnr=  sp.Booking();
    }
    @AfterMethod
    public void TearDown(){
        driver.quit();
    }
}
