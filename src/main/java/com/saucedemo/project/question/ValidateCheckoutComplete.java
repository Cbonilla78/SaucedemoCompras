package com.saucedemo.project.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.project.ui.CheckoutCompleteUI.TXT_MENSSAGE_COMPLETE_ORDER;
import static com.saucedemo.project.utils.Constant.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
@Slf4j
public class ValidateCheckoutComplete implements Question<Boolean> {

    private String confirmOrder;

    @Override
    @Subject("{0} valida que se haya completado la orden de compra #confirmOrder")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        actor.attemptsTo(WaitUntil.the(TXT_MENSSAGE_COMPLETE_ORDER, isVisible()).forNoMoreThan(TIME_SHORT).seconds());
        String getTxtOrderComplete = TXT_MENSSAGE_COMPLETE_ORDER.resolveFor(actor).getText();
        if (getTxtOrderComplete.equals(confirmOrder)) {
            log.info(getTxtOrderComplete);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidateCheckoutComplete withParams(String confirmOrder) {
        return new ValidateCheckoutComplete(confirmOrder);
    }
}