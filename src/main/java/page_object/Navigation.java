package page_object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class Navigation {
    public static HomePage homePage = new HomePage();
    public static CatalogPage catalogPage = new CatalogPage();
    public static void navigateToComputerAndNetworkSection() {
        open("https://www.onliner.by/");
        homePage.clickOnCatalogLink();
        catalogPage.navigateOnComputerAndNetworkSection();
    }

    public static void clickOnCatalogSection() {
        open("https://www.onliner.by/");
        homePage.clickOnCatalogLink();
    }


}
