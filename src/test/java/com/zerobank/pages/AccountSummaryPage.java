package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//*[@style='text-decoration: underline'])[1]")
    public WebElement savingsLink;

    @FindBy(linkText="Brokerage")
    public WebElement brokerageLink;

    @FindBy(linkText="Checking")
    public WebElement checkingLink;

    @FindBy(linkText="Credit Card")
    public WebElement creditCardLink;

    @FindBy(linkText="Loan")
    public WebElement loanLink;

    @FindBy (css = ".board-header")
    public List<WebElement> summaryOptions;

    @FindBy (xpath = "(//table)[3]//thead//tr")
    public List<WebElement> creditCardColumns;

}