package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PayBillsStepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("User enter amount of payment {string}")
    public void user_enter_amount_of_payment(String string) {
        payBillsPage.amountBox.sendKeys(string);
    }

    @When("User enter day of payment {string}")
    public void user_enter_day_of_payment(String date) {
        payBillsPage.dateBox.sendKeys(date);
    }

    @When("User click Pay button")
    public void user_click_Pay_button() {
        payBillsPage.payButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User should see this message: {string}")
    public void user_should_see_this_message(String expectedConfirmationMssg) {
        String actualConfirmationMssg = payBillsPage.confirmationMssg.getText();
        System.out.println("expectedConfirmationMssg = " + expectedConfirmationMssg);
        System.out.println("actualConfirmationMssg = " + actualConfirmationMssg);
        Assert.assertEquals("verify confirmation message", expectedConfirmationMssg, actualConfirmationMssg);
    }

    @Then("User should see this alert: {string}")
    public void user_should_see_this_alert(String expectedAlertMessage) {
        Assert.assertEquals("verify alert", expectedAlertMessage,Driver.get().findElement(By.name("amount")).getAttribute("validationMessage"));
    }
    @Then("User should not see this message: {string}")
    public void user_should_not_see_this_message(String expectedMessage) {
        String actualConfirmationMssg = payBillsPage.confirmationMssg.getText();
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualConfirmationMssg = " + actualConfirmationMssg);
        Assert.assertNotEquals("verify invalid", expectedMessage,actualConfirmationMssg );
    }
}
