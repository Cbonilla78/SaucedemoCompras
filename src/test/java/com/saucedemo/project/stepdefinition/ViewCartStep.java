package com.saucedemo.project.stepdefinition;

import com.saucedemo.project.question.ValidateTheProductToCart;
import com.saucedemo.project.task.ChooseProducts;
import com.saucedemo.project.task.YourCart;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.saucedemo.project.utils.Constant.ACTOR;
import static com.saucedemo.project.utils.Constant.TWO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ViewCartStep {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("se autentica de forma exitosa y va hasta el carrito de compras")
    public void isSuccessfullyAuthenticatedAndGoesToTheShoppingCart() {
        theActorCalled(ACTOR).attemptsTo(
                ChooseProducts.withParams(TWO),
                YourCart.access());
    }

    @Then("visualizara los productos que anteriormente agrego")
    public void willDisplayTheProductsYouPreviouslyAdded() {
        theActorInTheSpotlight().should(
                seeThat(ValidateTheProductToCart.success(TWO))
        );
    }
}