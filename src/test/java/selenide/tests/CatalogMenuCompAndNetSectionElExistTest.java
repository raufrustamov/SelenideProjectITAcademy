package selenide.tests;

import com.codeborne.selenide.Configuration;
import data.CatalogMenuItems;
import org.junit.Before;
import org.junit.Test;
import page_object.CatalogPage;
import page_object.HomePage;

import static java.lang.Boolean.parseBoolean;
import static org.testng.AssertJUnit.assertEquals;
import static page_object.Navigation.navigateToComputerAndNetworkSection;

public class CatalogMenuCompAndNetSectionElExistTest {
    CatalogPage catalogPage = new CatalogPage();
/*    @Before
    public void setUp(){
        String browser = System.getProperty("selenide.browser", "safari");
        boolean headless = parseBoolean(System.getProperty("selenide.headless", "false"));

        Configuration.browser = browser;
        Configuration.headless = headless;
        Configuration.screenshots = true;
        Configuration.reportsFolder = "target";
    }*/
    @Test
    public void CheckForExistingItemsInComputerAndNetworkSectionTest() {
        navigateToComputerAndNetworkSection();
        assertEquals(catalogPage.getElementsFromCompAndNetwSection(),
                CatalogMenuItems.computerAndNetworkMenuItemsTemplate());
    }
}
