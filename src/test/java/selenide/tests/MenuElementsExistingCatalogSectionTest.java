package selenide.tests;

import com.codeborne.selenide.Configuration;
import data.CatalogMenuItems;
import org.junit.Before;
import org.junit.Test;
import page_object.CatalogPage;

import static java.lang.Boolean.parseBoolean;
import static org.testng.AssertJUnit.assertEquals;
import static page_object.Navigation.clickOnCatalogSection;

public class MenuElementsExistingCatalogSectionTest {
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
    public void CatalogElementsExistingTest() {
        clickOnCatalogSection();
        assertEquals(catalogPage.getElementsOnCatalogPage(), CatalogMenuItems.menuItemsTemplate());
    }
}
