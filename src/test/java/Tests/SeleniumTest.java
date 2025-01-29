package Tests;


import Pages.HomePage;
import Pages.ProductPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;
        static ExtentReports report;
      public static ExtentTest test;
        static ExtentReports extent= new ExtentReports();
    @BeforeSuite
    public void Setup() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark=new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.clickOrderProductLink();
    }

    @Test
    void validateTitlesOnlineProducts()  {
test=extent.createTest("Validate Shoe title on Product page","this test validates that different footwear title is correct");
        ProductPages.formalshoes_verifyTitle();
        ProductPages.sportsshoes_verifyTitle();
        ProductPages.sneakerss_verifyTitle();
    }
    @Test
    void validateFirstFormalShoes(){
        test=extent.createTest("Validate 1st formal Shoe ","this test validates 1st formal Shoe title is correct");
        ProductPages.formalShoes_firstshoeVerify();
    }

    @Test
    void validateFirstSportsShoes(){
        test=extent.createTest("Validate 1st Sports Shoe ","this test validates 1st Sports Shoe title is correct");
        ProductPages.sportsShoes_firstshoeVerify();
    }
    @Test
    void validateFirstSneaker(){
        test=extent.createTest("Validate 1st Sneaker ","this test validates 1st Sneaker title is correct");
        ProductPages.sneakers_firstshoeVerify();
    }
    @AfterSuite
    public void cleanup(){
        extent.flush();
    }
}
