package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage extends BasePage {


    public PayBillsPage (){PageFactory.initElements(Driver.get(), this);}

    @FindBy(css = "#sp_amount")
    public WebElement amountBox;

    @FindBy(css = "#sp_date")
    public WebElement dateBox;

    @FindBy(css = "#pay_saved_payees")
    public WebElement payButton;

    @FindBy (xpath = "//span[@title]")
    public WebElement confirmationMssg;

}
