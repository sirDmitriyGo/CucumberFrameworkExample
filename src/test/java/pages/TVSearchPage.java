package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;



public class TVSearchPage extends CommonMethods {
    @FindBy(xpath = "//span[text()='Samsung']")
    public WebElement samsungCheckBox;
    @FindBy(xpath = "//select[@class='a-native-dropdown a-declarative']")
    public WebElement sortByDropDown;

    // dynamic element by position on search table

    @FindBy(xpath = "//div[@data-index='2']")
    public WebElement secondSearchResult;

    public TVSearchPage(){
        PageFactory.initElements(driver, this);
    }
}
