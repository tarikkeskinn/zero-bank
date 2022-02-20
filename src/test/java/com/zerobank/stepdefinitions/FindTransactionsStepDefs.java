package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FindTransactionsStepDefs {

   /* FindTransactionsPage findTransactionsPage = new FindTransactionsPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        accountActivityPage.accountActivity.click();
        BrowserUtils.waitFor(1);
        findTransactionsPage.findTransactions.click();
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String firstDate, String lastDate) {

        firstDate="2012-09-01";
        lastDate= "2012-09-06";
        findTransactionsPage.firstDate.sendKeys(firstDate);
        findTransactionsPage.lastDate.sendKeys(lastDate);

    }

    @When("clicks search")
    public void clicks_search() {

        findTransactionsPage.findButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("results table should only show transactions dates between {string} to {string} ")
    public void results_table_should_only_show_transactions_dates_between_to(String firstDate, String lastDate) {

        List<String> list= BrowserUtils.getElementsText(findTransactionsPage.filterTable);
        String actualFirstDate = list.get(0);
        String actualLastDate = list.get(2);

        Assert.assertEquals(firstDate,actualFirstDate);
        Assert.assertEquals(lastDate,actualLastDate);
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


*/


}
