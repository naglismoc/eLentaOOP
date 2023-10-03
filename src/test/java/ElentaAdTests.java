import models.Helper;
import models.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class ElentaAdTests {



    @Test
    public void test1(){
        Register r = new Register("puodukas","zelatininis. gerk greitai bo prakiurs","44","Kaunas","37065987458","gal@puoduko.lt");
        r.fill();
        String successMsg  = Helper.driver.findElement(By.xpath("//*[@id=\"fileinput-label\"]/span")).getText();
        Assert.assertEquals(successMsg, "įkelkite nuotraukas");
    }

    @BeforeClass
    public void beforeClass() {
        Helper.driver = new ChromeDriver();
        Helper.driver.manage().window().maximize();
        Helper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waits until the page loads
        Helper.acceptCookies();
    }

    @AfterClass
    public void afterClass() {
        Helper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Helper.driver.quit();
    }


    @BeforeMethod
    public void beforeMethod() {
        Helper.driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_AuginantiemsVaikus&actionId=Siulo&returnurl=%2Fregistracija");
        Helper.driver.findElement(By.id("title")).clear();
        Helper.driver.findElement(By.id("text")).clear();
        Helper.driver.findElement(By.id("price")).clear();
        Helper.driver.findElement(By.id("location-search-box")).clear();
        Helper.driver.findElement(By.id("phone")).clear();
        Helper.driver.findElement(By.id("email")).clear();
    }

    @AfterMethod
    public void afterMethod() {


    }
}
