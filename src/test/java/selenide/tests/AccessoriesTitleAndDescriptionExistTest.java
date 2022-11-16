package selenide.tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import page_object.CatalogPage;

import java.util.List;

import static java.lang.Boolean.parseBoolean;
import static org.testng.AssertJUnit.assertFalse;
import static page_object.Navigation.navigateToComputerAndNetworkSection;

public class AccessoriesTitleAndDescriptionExistTest {
    CatalogPage catalogPage = new CatalogPage();

    public static boolean checkForEmpty(List<String> itemsCatalog) {
        return itemsCatalog.contains("");
    }

    @Before
    public void setUp(){
        String browser = System.getProperty("selenide.browser", "safari");
        boolean headless = parseBoolean(System.getProperty("selenide.headless", "false"));

        Configuration.browser = browser;
        Configuration.headless = headless;
        Configuration.screenshots = true;
        Configuration.reportsFolder = "target";
    }
    @Test
    public void CheckForExistingDescriptionTest() {

        navigateToComputerAndNetworkSection();
        assertFalse(checkForEmpty(catalogPage.getAccessoriesItemsDescription()));
    }

    @Test
    public void CheckForExistingTitleTest() {

        navigateToComputerAndNetworkSection();
        assertFalse(checkForEmpty(catalogPage.getAccessoriesItemsTitle()));
    }


}
