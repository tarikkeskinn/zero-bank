package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefs {

    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @When("User should be able to navigate {string} page")
    public void user_should_be_able_to_navigate_page(String pageName) {
     new DashboardPage().navigate(pageName);

    }

    @Then("Account drop down default option should be {string}")
    public void account_drop_down_default_option_should_be(String expecteddDefaultOption) {

        String actualDefaultOption = accountActivityPage.dropDownMenuFirst();
        System.out.println("expecteddDefaultOption = " + expecteddDefaultOption);
        System.out.println("actualDefaultOption = " + actualDefaultOption);
        Assert.assertEquals("verify default options", expecteddDefaultOption,actualDefaultOption);
    }

    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> expectedAccountDDOptions) {

        List<String> actualAccountDDOptions= accountActivityPage.dropDownMenuAllOptions();

        System.out.println("expectedAccountDDOptions = " + expectedAccountDDOptions);
        System.out.println("actualAccountDDOptions = " + actualAccountDDOptions);
        Assert.assertEquals("verify account DD options",expectedAccountDDOptions,actualAccountDDOptions);
    }

    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expectedTransactionsColums) {

        List<String> actualTransactionsColums = BrowserUtils.getElementsText(accountActivityPage.transactionTableOptions);
        System.out.println("expectedTransactionsColums = " + expectedTransactionsColums);
        System.out.println("actualTransactionsColums = " + actualTransactionsColums);

        Assert.assertEquals("verify transaction table options", expectedTransactionsColums,actualTransactionsColums);
    }

}
