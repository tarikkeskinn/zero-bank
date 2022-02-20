package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "button#signin_button")
    public WebElement firstSigIn;

    @FindBy(css = "input#user_login")
    public WebElement loginBox;


    @FindBy(css = "input#user_password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement lastSignIn;

    @FindBy(xpath = "//div [@class='alert alert-error']")
    public WebElement wrongText;

    public void login() {
        Driver.get().get(ConfigurationReader.get("url"));
        firstSigIn.click();
        loginBox.sendKeys(ConfigurationReader.get("driver_username"));
        passwordBox.sendKeys(ConfigurationReader.get("driver_password"));
        lastSignIn.click();
        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
        BrowserUtils.waitFor(1);

    }

    public void login(String username, String password) {
        firstSigIn.click();
        loginBox.sendKeys(username);
        passwordBox.sendKeys(password);
        lastSignIn.click();

        BrowserUtils.waitFor(1);
    }


}
