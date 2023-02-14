package com.qa.spicejet.TestBase;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase{
  public static Properties prop;
  public static WebDriver driver;

  public TestBase(){
      try{
          prop=new Properties();
          FileInputStream ip=new FileInputStream("/Users/archanamudlapur/Documents/Practice1/src/main/java/com/qa/spicejet/config/Config.properties");
          prop.load(ip);
      }
      catch (FileNotFoundException e){
          e.printStackTrace();
      }
      catch (IOException e){
          e.printStackTrace();
      }
  }


    public static void initialization() {
      String Browser= prop.getProperty("browser");
      if(Browser.equals("Chrome")){
          System.setProperty("webdriver.chrome.driver","/Users/archanamudlapur/Documents/Practice1/src/main/resources/chromedriver");
          driver=new ChromeDriver();
      }
      else {
          System.out.println("Browser not Found");
      }

      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
      driver.get(prop.getProperty("url"));
    }







    }

