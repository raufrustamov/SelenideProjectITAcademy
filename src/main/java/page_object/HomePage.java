package page_object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class HomePage {

    public static final String HOME_PAGE_MAIN_MENU_XPATH_PATTERN =
            "//*[@class='b-main-navigation__text' and contains(text(),'%s')]";

    public void clickOnMainNavigationMenu(String link) {
        $(By.xpath(format(HOME_PAGE_MAIN_MENU_XPATH_PATTERN, link))).click();
    }

    public void clickOnCatalogLink() {
        clickOnMainNavigationMenu("Каталог");
    }
}
