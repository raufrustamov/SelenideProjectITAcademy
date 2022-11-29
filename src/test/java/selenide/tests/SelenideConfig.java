package selenide.tests;

import com.codeborne.selenide.SelenideDriver;

public class SelenideConfig {
    public static SelenideDriver browser(String browser){
        SelenideDriver getBrowser = new SelenideDriver(
                new com.codeborne.selenide.SelenideConfig()
                        .timeout(6000)
                        .browser(browser)
                        .headless(true)
        );
        return getBrowser;
    }
}
