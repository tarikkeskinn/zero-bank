package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("User should be able to login with valid credentials")
    public void user_should_be_able_to_login_with_valid_credentials() {

        loginPage.login();
    }

    @Then("User should see page title {string}")
    public void page_should_be_displayed_and_page_title(String expectedPageTitle) {
        String actualPageTitle= Driver.get().getTitle();
        Assert.assertEquals("verify page title", expectedPageTitle,actualPageTitle);
        System.out.println("expectedPageTitle = " + expectedPageTitle);
        System.out.println("actualPageTitle = " + actualPageTitle);
    }

    @Given("User logins with invalid {string} and {string}")
    public void user_logins_with_invalid_and(String username, String password) {
        loginPage.login(username, password);

    }

    @Then("User should see {string} message")
    public void user_should_see_message(String expectedMessage ) {

        String actualMessage = loginPage.wrongText.getText();
    }



}
