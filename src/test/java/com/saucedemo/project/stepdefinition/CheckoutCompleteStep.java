package com.saucedemo.project.stepdefinition;

import com.saucedemo.project.question.ValidateCheckoutComplete;
import com.saucedemo.project.task.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.saucedemo.project.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;






public class CheckoutCompleteStep {

    public static final String userDirectoryPath = System.getProperty("user.dir");

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("completar el formulario de datos de la compra {string}")
    public void isSuccessfullyAuthenticatedAndPerformsTheEntireProcessUntilThePurchaseDataFormIsCompleted(String data) {
        theActorCalled(ACTOR).attemptsTo(
          //      ChooseProducts.withParams(TWO),
                YourCart.access(),
                YouCartCheckout.access(),
                PurchasindInformationForm.withParams
                        (userDirectoryPath + PATH_JSON + data),
                CheckoutComplete.access()
        );
    }

    @Then("visualizara un mensaje de la compra completada {string}")
    public void willDisplayAMessageOfTheCompletedPurchase(String messageConfirmOrder) {
        theActorInTheSpotlight().should(
                seeThat(ValidateCheckoutComplete.withParams(messageConfirmOrder))
        );
    }
}