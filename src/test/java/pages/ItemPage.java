package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ItemPage extends CommonMethods {



    @FindBy(xpath = "//h1[@class='a-size-base-plus a-text-bold']")
    private WebElement aboutItemText;

    public WebElement getAboutItemText() {
        return aboutItemText;
    }
//in real life scenario this class will have dozens of elements. this structure just example

    public ItemPage() {
        PageFactory.initElements(driver, this);
    }
}
