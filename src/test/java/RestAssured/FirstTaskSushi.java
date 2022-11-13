package RestAssured;

import dataForRestAssured.SushiModel;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class FirstTaskSushi {
    private static final String ENDPOINT_ADDRESS = "https://catalog.onliner.by/sdapi/catalog.api/search/sushivesla";
    private static final String ROLLS_SUSHI_FILTER_ENDPOINT_ADDRESS =
            "https://catalog.onliner.by/sdapi/catalog.api/search/sushivesla?sushi_typ[0]=roll&sushi_typ[operation]=union";

    @Test
    public void sushiTestApi() {
        List<SushiModel> sushi = given()
                .when()
                .get(ENDPOINT_ADDRESS)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .getBody()
                .jsonPath()
                .getList("products", SushiModel.class);

        sushi.forEach(sushiModel -> {
            assertThat(sushiModel).extracting("id", "name", "full_name").doesNotContainNull();
            assertThat(sushiModel).extracting("name", "full_name").doesNotContain("");
        });
    }

    @Test
    public void sushiRollsTestApi() {
        List<String> prefixName = given()
                .when()
                .get(ROLLS_SUSHI_FILTER_ENDPOINT_ADDRESS)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .getBody()
                .jsonPath()
                .getList("products.name_prefix");
        prefixName.forEach(s -> assertThat(s).isEqualTo("Роллы"));
    }
}
