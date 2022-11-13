package page_object;

import org.openqa.selenium.By;
import utils.CommonWebElementUtils;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class CatalogPage {
    static CommonWebElementUtils collectElements = new CommonWebElementUtils();

    public static List<String> collectElementsFromPages(String itemsName) {
       return collectElements.getTextsFromWebElements($$(By.xpath(itemsName)));
    }


    private static final String CATALOG_PAGE_MENU_BAR_XPATH_PATTERN =
            "//span[@class='catalog-navigation-classifier__item-title-wrapper']";

    public List<String> getElementsOnCatalogPage() {
        return collectElementsFromPages(CATALOG_PAGE_MENU_BAR_XPATH_PATTERN);
    }

    private static final String CATALOG_SUB_MENU_COMPUTER_AND_NETWORK_SECTION =
            "//div[contains(@class,'line-clamp-2')]";

    public List<String> getElementsFromCompAndNetwSection() {
        return collectElementsFromPages(CATALOG_SUB_MENU_COMPUTER_AND_NETWORK_SECTION);
    }

    public static final String COMPUTER_AND_NETWORK_SECTION =
            "//*[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'Компьютеры')]";

    public void navigateOnComputerAndNetworkSection() {
        $(By.xpath(COMPUTER_AND_NETWORK_SECTION)).click();

    }

    public static final String ACCESSORIES_MENU_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(),'Комплектующие')]";

    public void clickOnAccessoriesMenu() {
        $(By.xpath(ACCESSORIES_MENU_PATTERN)).click();
    }

    private static final String ACCESSORIES_ITEMS_TITLE =
            "//div[contains(@class,'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active')]" +
                    "//span[contains(@class,'catalog-navigation-list__dropdown-title')]";
    private static final String ACCESSORIES_ITEMS_DESCRIPTION =
            "//div[contains(@class,'catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active')]" +
                    "//span[contains(@class,'catalog-navigation-list__dropdown-description')]";

    public List<String> getAccessoriesItemsTitle() {
        return collectElementsFromPages(ACCESSORIES_ITEMS_TITLE);
    }

    public List<String> getAccessoriesItemsDescription() {
        return collectElementsFromPages(ACCESSORIES_ITEMS_DESCRIPTION);
    }




}
