package steps;

import pages.HamburgerMenuDropdown;
import pages.ItemPage;
import pages.LandingPage;
import pages.TVSearchPage;

public class PageInitializer {
    public static HamburgerMenuDropdown hamburgerMenuDropdown;
    public static ItemPage itemPage;
    public static LandingPage landingPage;
    public static TVSearchPage tvSearchPage;

    public static void initializePageObjects(){
        hamburgerMenuDropdown = new HamburgerMenuDropdown();
        itemPage = new ItemPage();
        landingPage = new LandingPage();
        tvSearchPage =new TVSearchPage();

    }
}
