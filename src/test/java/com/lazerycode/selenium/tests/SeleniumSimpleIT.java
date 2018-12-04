package com.lazerycode.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lazerycode.selenium.DriverBase;

public class SeleniumSimpleIT extends DriverBase {
	
    @Test
    public void petTitleTest() throws Exception {
    	WebDriver driver = getDriver();

        driver.navigate().to("http://localhost:8081/");
    
        Assert.assertTrue(driver.getTitle().contains("PetClinic"));
    }

    @Test
    public void petImgTest() throws Exception {
        WebDriver driver = getDriver();

        driver.navigate().to("http://localhost:8081/");

        WebDriverWait wait = new WebDriverWait(driver, 10, 100);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("img-responsive")));

    }


}
