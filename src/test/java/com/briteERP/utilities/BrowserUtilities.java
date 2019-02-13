package com.briteERP.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

public class BrowserUtilities {

    public static String getScreenshot(String name) {
        // name the screenshot with current date-time to avoid duplicate naming
        String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakeScreenshot -> interface from selenium which takes screenshots
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
        }
        return target;
    }

    public static void waitForTitleContains(String word){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleContains(word));
    }
    public static void waitForClickablility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForAttributeToContain(WebElement webElement, String attribute, String value){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15 );
        wait.until(ExpectedConditions.attributeContains(webElement,attribute, value));
    }
    public static void waitForElementToBoVisible(WebElement webElement){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void textToBePresentInElementValue(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, "50.000"));

    }


}
