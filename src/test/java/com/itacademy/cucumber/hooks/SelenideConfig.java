package com.itacademy.cucumber.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import static java.lang.Boolean.parseBoolean;

public class SelenideConfig {

    public void getBrowser() {
        String browser = System.getProperty("selenide.browser", "chrome");
        boolean headless = parseBoolean(System.getProperty("selenide.headless", "false"));

        Configuration.browser = browser;
        Configuration.headless = headless;
        Configuration.screenshots = true;
        Configuration.reportsFolder = "target";
    }


    public void closeSession() {
        WebDriverRunner.closeWebDriver();
    }

}
