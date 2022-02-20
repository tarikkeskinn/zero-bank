package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Given("User should be able to log in application")
    public void user_should_be_able_to_log_in_application() {
        new LoginPage().login();
    }

    @Then("Account Summary page should have the following account types")
    public void account_Summary_page_should_have_the_following_account_types(List<String> expectedSummaryOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(accountSummaryPage.summaryOptions);
        Assert.assertEquals(expectedSummaryOptions, actualOptions);
        System.out.println("expectedOptions = " + expectedSummaryOptions);
        System.out.println("actualOptions = " + actualOptions);
    }

    @Then("Credit Accounts Table should have following columns")
    public void credit_Accounts_Table_should_have_following_columns(List<String> creditAccountsColumns) {
        List<String> actualColumns = BrowserUtils.getElementsText(accountSummaryPage.creditCardColumns);
        Assert.assertEquals("verify account columns", creditAccountsColumns, actualColumns);
        System.out.println("creditAccountsColumns = " + creditAccountsColumns);
        System.out.println("actualColumns = " + actualColumns);
    }
}