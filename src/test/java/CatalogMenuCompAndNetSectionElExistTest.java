import data.CatalogMenuItems;
import org.junit.Test;
import page_object.CatalogPage;
import page_object.HomePage;

import static org.testng.AssertJUnit.assertEquals;
import static page_object.Navigation.navigateToComputerAndNetworkSection;

public class CatalogMenuCompAndNetSectionElExistTest {
    CatalogPage catalogPage = new CatalogPage();
    @Test
    public void CheckForExistingItemsInComputerAndNetworkSectionTest() {
        navigateToComputerAndNetworkSection();
        assertEquals(catalogPage.getElementsFromCompAndNetwSection(),
                CatalogMenuItems.computerAndNetworkMenuItemsTemplate());
    }
}
