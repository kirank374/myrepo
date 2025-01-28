package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.test;
import static Tests.SeleniumTest.*;

public class ProductPages {

    public static String formalShoes_xpath="/html/body/div[2]/center/h2";
    public static String sportsShoes_xpath="/html/body/div[3]/center/h2";
    public static String sneakers_xpath="/html/body/div[4]/center/h2";
    public static String formalShoesDropdown_xpath="/html/body/div[2]/center/div/i[1]";
    public static String sportsShoesDropdown_xpath="/html/body/div[3]/center/div/i[1]";
    public static String sneakersDropdown_xpath="/html/body/div[4]/center/div/i[1]";
    public static String formalShoes_firstshoename="/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportsShoes_firstshoename="/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneakers_firstshoename="/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalshoes_verifyTitle(){
        String expectedTitleFS ="Formal Shoes ";
String actualTitleFS= driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS,actualTitleFS);
        if(expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS,"test passed for title verification of formal shoe");
        }
        else {
            test.log(Status.FAIL,"test failed for title verification of formal shoe");
        }
    }
    public static void sportsshoes_verifyTitle(){
        String expectedTitleSS ="Sports Shoes";
        String actualTitleSS= driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS,actualTitleSS);
        if(expectedTitleSS.equals(actualTitleSS)){
            test.log(Status.PASS,"test passed for title verification of sport shoes");
        }
    }
    public static void sneakerss_verifyTitle(){
        String expectedTitleSn ="Sneakers";
        String actualTitleSn= driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(expectedTitleSn,actualTitleSn);
        if(expectedTitleSn.equals(actualTitleSn)){
            test.log(Status.PASS,"test passed for title verification of sneakers");
        }
    }
    public static void formalShoes_firstshoeVerify(){
        String expectedFirstFormalShoe="   Classic Cheltenham";
driver.findElement(By.xpath(formalShoesDropdown_xpath)).click();
String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstshoename)).getText();
Assert.assertEquals(expectedFirstFormalShoe,actualFirstFormalShoe);
if(expectedFirstFormalShoe.equals(actualFirstFormalShoe)){
    test.log(Status.PASS,"test passed for title verification of first formal shoe");
}

    }
    public static void sportsShoes_firstshoeVerify(){
        String expectedFirstSportsShoe="   Ultimate";
        driver.findElement(By.xpath(sportsShoesDropdown_xpath)).click();
        String actualFirstSportsShoe = driver.findElement(By.xpath(sportsShoes_firstshoename)).getText();
        Assert.assertEquals(expectedFirstSportsShoe,actualFirstSportsShoe);
    }
    public static void sneakers_firstshoeVerify(){
        String expectedFirstSneakers="   Archivo";
        driver.findElement(By.xpath(sneakersDropdown_xpath)).click();
        String actualFirstSneakers = driver.findElement(By.xpath(sneakers_firstshoename)).getText();
        Assert.assertEquals(expectedFirstSneakers,actualFirstSneakers);
    }


}
