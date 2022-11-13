package Cucumber.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.HomePage;

import static com.codeborne.selenide.Selenide.actions;
import static org.assertj.core.api.Assertions.assertThat;


public class CarFoodsMenuSteps {
    HomePage homePage = new HomePage();

    @Given("The user is on the main page of the site")
    public void theUserIsOnTheMainPageOfTheSite() {
        Selenide.open("https://onliner.by");
        assertThat(homePage.getHomepageTitle()).isEqualTo("Onliner");
    }

    @When("The user hovers over the Car menu  item")
    public void theUserHoversOverTheCarMenuItem() {
        actions().moveToElement(homePage.getCarGoodInMainMenu()).build().perform();
    }

    @Then("A submenu with categories \\(by prices, by city and brand) appears")
    public void aSubmenuWithCategoriesByPricesByCityAndBrandAppears() {
        assertThat(homePage.getCarGoodMenuItemsPattern("р.")).containsIgnoringCase("Авто до 4000 р.");
        assertThat(homePage.getCarGoodMenuItemsPattern("Минск")).isEqualTo("Минск");
        assertThat(homePage.getCarGoodMenuItemsPattern("udi")).isEqualTo("Audi");
    }

    @After
    public void quitBrowser() {
        WebDriverRunner.getWebDriver().quit();
    }
}
