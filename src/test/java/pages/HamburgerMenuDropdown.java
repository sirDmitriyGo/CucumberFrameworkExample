package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class HamburgerMenuDropdown extends CommonMethods {

    @FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
    public WebElement tvElectronicsLink;
    @FindBy(xpath = "//a[text()='Televisions']")
    public WebElement televisionsLink;

    //in real life scenario this class will have dozens of elements. this structure just example

    public HamburgerMenuDropdown() {
        PageFactory.initElements(driver, this);
    }
}
