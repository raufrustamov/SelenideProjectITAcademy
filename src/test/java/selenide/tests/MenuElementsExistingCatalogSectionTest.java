package selenide.tests;

import data.CatalogMenuItems;
import org.junit.Test;
import page_object.CatalogPage;

import static org.testng.AssertJUnit.assertEquals;
import static page_object.Navigation.clickOnCatalogSection;

public class MenuElementsExistingCatalogSectionTest {
    CatalogPage catalogPage = new CatalogPage();

    @Test
    public void CatalogElementsExistingTest() {
        clickOnCatalogSection();
        assertEquals(catalogPage.getElementsOnCatalogPage(), CatalogMenuItems.menuItemsTemplate());
    }
}
