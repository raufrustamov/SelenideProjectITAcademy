package Cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.HomePage;

import static com.codeborne.selenide.Selenide.actions;
import static org.assertj.core.api.Assertions.assertThat;

public class HousesAndApartmentsMenuSteps {
    HomePage homePage = new HomePage();

    @When("The user hovers over the Houses and apartments  item")
    public void theUserHoversOverTheHousesAndApartmentsItem() {
        actions().moveToElement(homePage.getHousesAndApartmentsSubmenuPattern()).build().perform();

    }

    @Then("A submenu with categories \\(cities, number of rooms, price range) appears")
    public void aSubmenuWithCategoriesCitiesNumberOfRoomsPriceRangeAppears() {
        assertThat(homePage.getHousesAndApartmentsItemsMenu(" $")).containsIgnoringCase("До 30 000 $");
        assertThat(homePage.getHousesAndApartmentsItemsMenu("Минск")).isEqualTo("Минск");
        assertThat(homePage.getHousesAndApartmentsItemsMenu("комнатные")).isEqualTo("1-комнатные");
    }
}
