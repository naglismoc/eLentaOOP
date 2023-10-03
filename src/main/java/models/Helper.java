package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helper {
    public static WebDriver driver;

    public static void acceptCookies() {
        driver.get("https://elenta.lt/");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p")).click();
    }
}
