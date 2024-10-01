package com.saucedemo.project.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/front/completethepurchaseuntilconfirmation.feature",
        glue = "com.saucedemo.project.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty",
        tags = "@checkoutComplete"
)
public class CheckoutCompleteRunner {
}
