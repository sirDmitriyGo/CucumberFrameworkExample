package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LandingPage;
import utils.CommonMethods;

public class AboutItemIsPresentSteps extends CommonMethods {
    @Given("user navigate to Amazon {string}")
    public void userNavigateToAmazon(String country) {
  Assert.assertEquals(landingPage.getCountryVerify().getText(),country );
    }

    @When("user finds item he likes using sort {string}")
    public void userFindsItemHeLikesUsingSort(String sortType) {
       click(landingPage.getHamburgerAll());

       implicitlyWait();
       click(hamburgerMenuDropdown.getTvElectronicsLink());
       click(hamburgerMenuDropdown.getTelevisionsLink());
       click(tvSearchPage.getSamsungCheckBox());
       implicitlyWaitOff();

       selectDD(tvSearchPage.getSortByDropDown(), sortType);

       click(tvSearchPage.getSecondSearchResult());
       driver.getWindowHandle();
       driver.switchTo().window(getNextHandle(driver.getWindowHandle()));

    }


    @Then("user able to see {string}")
    public void userAbleToSee(String textToConfirm) {
        implicitlyWait();
        Assert.assertTrue(itemPage.getAboutItemText().isDisplayed());
        scroll(itemPage.getAboutItemText());
        Assert.assertEquals(itemPage.getAboutItemText().getText(), textToConfirm);

    }



}
