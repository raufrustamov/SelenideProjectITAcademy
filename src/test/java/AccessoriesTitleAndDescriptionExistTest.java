import org.testng.annotations.Test;
import page_object.CatalogPage;

import static org.testng.AssertJUnit.assertFalse;
import static page_object.Navigation.navigateToComputerAndNetworkSection;

public class AccessoriesTitleAndDescriptionExistTest {
    CatalogPage catalogPage = new CatalogPage();

    @Test
    public void CheckForExistingDescriptionTest() {
        navigateToComputerAndNetworkSection();
        assertFalse(catalogPage.checkForEmpty(catalogPage.getAccessoriesItemsDescription()));
    }

    @Test
    public void CheckForExistingTitleTest() {
        navigateToComputerAndNetworkSection();
        assertFalse(catalogPage.checkForEmpty(catalogPage.getAccessoriesItemsTitle()));
    }


}
