package com.qa.spicejet.TestCases;

import com.qa.spicejet.Pages.LandingPage;
import com.qa.spicejet.Pages.LoginPage;
import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.Windowhandles;
import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LandingPage lp;
    LoginPage login;
    public LoginPageTest(){
        super();
    }
    @BeforeMethod
    public void Setup(){
        initialization();
        login=new LoginPage();
        lp=new LandingPage();
      login= lp.LandingPageLogin();




    }

    @Test
    public void GetTitleTest(){
        String Title=login.GetTitle();
        System.out.println(Title);
    }
    @Test
    public void fillDetailsTest() throws InterruptedException {
    login.FillDetails(prop.getProperty("email"), prop.getProperty("pass") );


    }

    @AfterMethod
   public void TearDown(){
       driver.quit();
    }
}
