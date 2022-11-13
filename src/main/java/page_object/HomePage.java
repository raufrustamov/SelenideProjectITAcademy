package page_object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class HomePage {

    public static final String HOME_PAGE_MAIN_MENU_XPATH_PATTERN =
            "//*[@class='b-main-navigation__text' and contains(text(),'%s')]";
    public static final String CAR_GOOD_IN_MAIN_MENU =
            "//span[@class='b-main-navigation__text'][contains(text(),'Автобарахолка')]";

    public static final String HOUSES_AND_APARTMENTS_SUBMENU_PATTERN=
            "//span[@class='b-main-navigation__text'][contains(text(),'Дома и квартиры')]";
    public static final String HOUSES_AND_APARTMENTS_ITEMS_MENU=
            "//span[contains(text(),'%s')]";
    public static final String CAR_GOOD_MENU_ITEMS_PATTERN=
            "//span[contains(text(),'%s')]";


    public void clickOnMainNavigationMenu(String link) {
        $(By.xpath(format(HOME_PAGE_MAIN_MENU_XPATH_PATTERN, link))).click();
    }

    public void clickOnCatalogLink() {
        clickOnMainNavigationMenu("Каталог");
    }

    public static final String HOME_PAGE_TITLE_XPATH_PATTERN =
            "//title[normalize-space()='Onliner']";

    public String getHomepageTitle(){
        return ($x(HOME_PAGE_TITLE_XPATH_PATTERN)).getOwnText();
    }
    public SelenideElement getCarGoodInMainMenu(){
        return ($x(CAR_GOOD_IN_MAIN_MENU));
    }
    public String getCarGoodMenuItemsPattern(String containsText){
        return ($x(format(CAR_GOOD_MENU_ITEMS_PATTERN,containsText)).getOwnText());
    }
    public SelenideElement getHousesAndApartmentsSubmenuPattern(){
        return ($x(HOUSES_AND_APARTMENTS_SUBMENU_PATTERN));
    }

    public String getHousesAndApartmentsItemsMenu(String conatainText){
        return ($x(format(HOUSES_AND_APARTMENTS_ITEMS_MENU,conatainText)).getOwnText());
    }



}
