package com.saucedemo.project.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.project.ui.YourCartUI.BTN_CHECKOUT;

public class YouCartCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT)
        );
    }

    public static YouCartCheckout access() {
        return Tasks.instrumented(YouCartCheckout.class);
    }
}