package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LandingPage extends CommonMethods {


    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    public WebElement hamburgerAll;

// real life scenario will have dozens of elements. this structure just example
public LandingPage(){
    PageFactory.initElements(driver,this);
}
}
