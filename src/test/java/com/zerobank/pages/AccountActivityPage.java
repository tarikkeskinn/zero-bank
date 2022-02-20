package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(linkText = "Account Activity")
    public WebElement accountActivity;

    @FindBy(css = "#ui-tabs-1>div>table>thead>tr")
    public List<WebElement> transactionTableOptions;



    public String dropDownMenuFirst () {
        WebElement dropDownElement = Driver.get().findElement(By.id("aa_accountId"));
        Select select = new Select(dropDownElement);

        return select.getFirstSelectedOption().getText();
    }

    public List<String> dropDownMenuAllOptions () {
        WebElement dropDownElement = Driver.get().findElement(By.id("aa_accountId"));
        Select select = new Select(dropDownElement);

        return BrowserUtils.getElementsText(select.getOptions());
    }

}
