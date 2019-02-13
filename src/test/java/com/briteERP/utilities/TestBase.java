package com.briteERP.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

     protected WebDriver driver;
     protected Actions actions;
     protected SoftAssert softAssert;
     protected Pages pages;

    protected static ExtentReports report;
    private static ExtentHtmlReporter htmlReporter;
    protected static ExtentTest extentLogger;

    @BeforeTest (alwaysRun = true)
    public void setUpTest(){
        report= new ExtentReports();
        // this is our custom location of the report that will be generated
        // report will be generated in the current project inside folder: test-output
        // report file name: report.html
        String path= System.getProperty("user.dir")+"/test-output/report.html";
        htmlReporter= new ExtentHtmlReporter(path);
        report.attachReporter(htmlReporter);

        report.setSystemInfo("Environment", "Staging");
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));
        report.setSystemInfo("OS", System.getProperty("os.name"));
        report.setSystemInfo("QA Engineer", ".....");

        htmlReporter.config().setDocumentTitle("BriteERP reports");
        htmlReporter.config().setReportName("BriteERP Automated Test Reports");

//        htmlReporter.config().setTheme(Theme.DARK);
    }
    @BeforeMethod (alwaysRun = true)
    public void setup(){

         driver= Driver.getDriver();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         actions= new Actions(driver);
         softAssert= new SoftAssert();
         pages= new Pages();
         driver.get(ConfigurationReader.getProperty("url"));

     }
     @AfterMethod (alwaysRun = true)
    public void tearDown(ITestResult result) throws IOException {
         // if any test fails, it can detect it,
         // take a screen shot at the point and attach to report
         if (result.getStatus() == ITestResult.FAILURE) {
             String screenshotLocation = BrowserUtilities.getScreenshot(result.getName());
             extentLogger.fail(result.getName());
             extentLogger.addScreenCaptureFromPath(screenshotLocation);
             extentLogger.fail(result.getThrowable());

         } else if (result.getStatus() == ITestResult.SKIP) {
             extentLogger.skip("Test Case Skipped: " + result.getName());
         }
         Driver.closeDriver();
         softAssert.assertAll();
     }
    @AfterTest (alwaysRun = true)
    public void tearDownTest(){
        report.flush();
    }

}
