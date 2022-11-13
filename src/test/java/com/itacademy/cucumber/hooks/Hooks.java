package com.itacademy.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private final SelenideConfig selenideConfiguration;

    public Hooks(SelenideConfig selenideConfiguration) {
        this.selenideConfiguration = selenideConfiguration;
    }

    @Before

    public void BeforeScenario() {
        selenideConfiguration.getBrowser();
    }

    @After
    public void AfterScenario() {

    }
}
