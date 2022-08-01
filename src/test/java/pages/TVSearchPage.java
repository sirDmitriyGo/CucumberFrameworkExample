package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;



public class TVSearchPage extends CommonMethods {
    @FindBy(xpath = "//span[text()='Samsung']")
    private WebElement samsungCheckBox;

    public WebElement getSamsungCheckBox() {
        return samsungCheckBox;
    }



    @FindBy(xpath = "//select[@class='a-native-dropdown a-declarative']")
    private WebElement sortByDropDown;

    public WebElement getSortByDropDown() {
        return sortByDropDown;
    }

    // dynamic element by position on search table

    @FindBy(xpath = "//div[@data-index='2']")
    private WebElement secondSearchResult;

    public WebElement getSecondSearchResult() {
        return secondSearchResult;
    }

    public TVSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
