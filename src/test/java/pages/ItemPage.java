package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ItemPage extends CommonMethods {

    @FindBy(xpath = "//h1[@class='a-size-base-plus a-text-bold']")
    public WebElement aboutItemText;



    public ItemPage(){
        PageFactory.initElements(driver, this);
    }
}
