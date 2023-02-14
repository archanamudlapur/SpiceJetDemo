package com.qa.spicejet.TestUtil;

import com.qa.spicejet.TestBase.TestBase;
import javafx.scene.Parent;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Set;

public class Windowhandles extends TestBase {
    public static void GetWindowHandles() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String Parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
    }

    public static void Js(WebDriver driver, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    public static void jsclick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click;", element);
    }

    public static void jsenterpass(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("document.getElementById('new-password').setAttribute('value','ufiufi1@')");
    }

    public static void Alertclass() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.dismiss();


    }
    public static void ActionClass(WebElement element){
       Actions action=new Actions(driver);
       action.moveToElement(element).build().perform();
    }
    public static void JsExecuteScroll(WebDriver driver,WebElement element){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
}
