package com.saucedemo.project.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.saucedemo.project.ui.CheckoutOverviewUI.BTN_FINISH;

public class CheckoutComplete implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_FINISH),
                Click.on(BTN_FINISH)
        );
    }

    public static CheckoutComplete access() {
        return Tasks.instrumented(CheckoutComplete.class);
    }
}