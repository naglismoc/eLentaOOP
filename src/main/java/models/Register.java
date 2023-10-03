package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
    public WebDriver driver;

    public String title;
    public String text;
    public String price;
    public String city;
    public String phone;
    public String email;

    public Register(String title, String text, String price, String city, String phone, String email) {
        this.title = title;
        this.text = text;
        this.price = price;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.driver = Helper.driver;
    }

    public void fill(){
        driver.findElement(By.id("title")).sendKeys(this.title);
        driver.findElement(By.id("text")).sendKeys(text);
        driver.findElement(By.id("price")).sendKeys(price);
        driver.findElement(By.id("location-search-box")).sendKeys(city);
        driver.findElement(By.id("phone")).sendKeys(phone);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("submit-button")).click();
    }


}
