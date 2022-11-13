package selenide.tests;
import org.testng.annotations.Test;
import page_object.CatalogPage;

import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static page_object.Navigation.navigateToComputerAndNetworkSection;

public class AccessoriesTitleAndDescriptionExistTest {
    CatalogPage catalogPage = new CatalogPage();
    public static boolean checkForEmpty(List<String> itemsCatalog) {
        return itemsCatalog.contains("");
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
