package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    LoginPage login = new LoginPage();
    String expectedOption;

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String link) {
        BrowserUtils.waitFor(1);

        if (link.equals("Savings")) {
            accountSummaryPage.savingsLink.click();
            expectedOption=link;
        } else if (link.equals("Brokerage")) {
            accountSummaryPage.brokerageLink.click();
            expectedOption=link;
        } else if (link.equals("Checking")) {
            accountSummaryPage.checkingLink.click();
            expectedOption=link;
        } else if (link.equals("Credit Card")) {
            accountSummaryPage.creditCardLink.click();
            expectedOption=link;
        } else if (link.equals("Loan")) {
            accountSummaryPage.loanLink.click();
            expectedOption=link;
        }
        BrowserUtils.waitFor(1);
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actualTitle= Driver.get().getTitle();
        String expectedTitle = "Zero - Account Activity";
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("verify the page title",expectedTitle,actualTitle);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        String actualOption = accountActivityPage.dropDownMenuFirst();

        System.out.println("actualOption = " + actualOption);
        System.out.println("expectedOption = " + expectedOption);
        Assert.assertEquals("verify selected options", expectedOption,actualOption);
    }
}
