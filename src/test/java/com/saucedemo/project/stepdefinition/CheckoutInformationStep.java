package com.saucedemo.project.stepdefinition;

import com.saucedemo.project.question.ValidatePageCheckoutOverview;
import com.saucedemo.project.task.ChooseProducts;
import com.saucedemo.project.task.PurchasindInformationForm;
import com.saucedemo.project.task.YouCartCheckout;
import com.saucedemo.project.task.YourCart;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.saucedemo.project.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckoutInformationStep {

    public static final String userDirectoryPath = System.getProperty("user.dir");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("se autentica de forma exitosa, elige los productos de preferencia y llena el formulario con datos basicos {string}")
    public void beSuccessfullyAuthenticatedChooseYourPreferredProductsAndFillOutTheFormWithBasicData(String data) {
        theActorCalled(ACTOR).attemptsTo(
                ChooseProducts.withParams(TWO),
                YourCart.access(),
                YouCartCheckout.access(),
                PurchasindInformationForm.withParams
                        (userDirectoryPath + PATH_JSON + data)
        );
    }

    @Then("visualizara la descripcion general {string}")
    public void willDisplayTheGeneralDescription(String checkoutText) {
        theActorInTheSpotlight().should(
                seeThat(ValidatePageCheckoutOverview.withParams(checkoutText))
        );
    }
}