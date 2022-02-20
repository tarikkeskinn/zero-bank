package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class FindTransactionsPage extends  BasePage{

    public FindTransactionsPage(){
        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy (linkText = "Find Transactions")
    public WebElement findTransactions;

    @FindBy (id = "aa_fromDate")
    public WebElement firstDate;

    @FindBy (id = "aa_toDate")
    public WebElement lastDate;

    @FindBy (xpath = "//button [@type='submit']")
    public WebElement findButton;

    @FindBy (xpath = "(//table[class='table table-condensed table-hover'])[2]//tbody/@/tr")
    public List<WebElement> filterTable;
}
