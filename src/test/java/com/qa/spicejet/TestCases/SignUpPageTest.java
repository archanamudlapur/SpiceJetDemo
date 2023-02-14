package com.qa.spicejet.TestCases;

import com.qa.spicejet.Pages.LandingPage;
import com.qa.spicejet.Pages.SignUpPage;
import com.qa.spicejet.TestBase.TestBase;
import com.qa.spicejet.TestUtil.ExcelReader;
import com.qa.spicejet.TestUtil.Windowhandles;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpPageTest extends TestBase {
    LandingPage lp;
    SignUpPage sp;
    String SheetnameTest = "contacts";

    public SignUpPageTest() {
        super();
    }

    @BeforeMethod
    public void Setup() {
        initialization();
        lp = new LandingPage();
        sp = lp.LandingPageSignUp();
        sp = new SignUpPage();
        Windowhandles.GetWindowHandles();
    }

    @Test()
    public void SignUpPageTest() {
        String TitleSignUp = sp.GetSignUpPageTitle();
        System.out.println(TitleSignUp);
    }

    @DataProvider
    public Object[][] GetData() {
        Object[][] DataTest = ExcelReader.ReadData(SheetnameTest);
        return DataTest;
    }

    @Test(dataProvider = "GetData")
    public void FillDetailsSignUpTest(String First_Name, String Last_Name, String DOB, String MobNum, String pass,String Cpass) throws InterruptedException {
        sp.FillDetailsSignUp(First_Name, Last_Name, DOB, MobNum,pass, Cpass);

    }


    @AfterMethod
    public void TearDown() {
       driver.close();

   }

}