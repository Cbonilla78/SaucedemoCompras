package com.saucedemo.project.stepdefinition;

import com.saucedemo.project.question.ValidateErrorCredentials;
import com.saucedemo.project.task.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static com.saucedemo.project.utils.Constant.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStep {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String pwd;
    private static final String ERROR_MESSAGE_TEXT = "Epic sadface: Username and password do not match any user in this service";

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa las credenciales")
    public void enterTheCredentials() {
        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PWD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(user, pwd)
        );
    }

    @When("ingresa las credenciales incorrectas")
    public void entertheincorrectcredentials() {
        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PWD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(pwd,user)
        );
    }


}