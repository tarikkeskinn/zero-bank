package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigate(String pageName) {

        String locator=  "//a[.='" +pageName+ "']";
        WebElement menu = Driver.get().findElement(By.xpath(locator));
        menu.click();
        BrowserUtils.waitFor(1);
    }



}

