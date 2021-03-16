package com.automationTest;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class junitTest {
    @Test
    public void findProduct() {
        WebDriver driver = Base.getDriver();
        driver.get("https://www.facebook.com/");
        String a=driver.findElement(By.name("login")).getText();
        Assert.assertEquals("Log In",a);

    }
}
