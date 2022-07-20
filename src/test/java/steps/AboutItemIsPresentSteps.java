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
  Assert.assertEquals(landingPage.countryVerify.getText(),country );
    }

    @When("user finds item he likes using sort {string}")
    public void userFindsItemHeLikesUsingSort(String sortType) {
       click(landingPage.hamburgerAll);

       implicitlyWait();
       click(hamburgerMenuDropdown.tvElectronicsLink);
       click(hamburgerMenuDropdown.televisionsLink);
       click(tvSearchPage.samsungCheckBox);
       implicitlyWaitOff();

       selectDD(tvSearchPage.sortByDropDown, sortType);

       click(tvSearchPage.secondSearchResult);
       driver.getWindowHandle();
       driver.switchTo().window(getNextHandle(driver.getWindowHandle()));

    }


    @Then("user able to see {string}")
    public void userAbleToSee(String textToConfirm) {
        implicitlyWait();
        Assert.assertTrue(itemPage.aboutItemText.isDisplayed());
        scroll(itemPage.aboutItemText);
        Assert.assertEquals(itemPage.aboutItemText.getText(), textToConfirm);

    }



}
