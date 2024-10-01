package com.saucedemo.project.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.project.ui.CheckoutOverviewUI.TXT_PAGE_CHECKOUT_OVERVIEW;
import static com.saucedemo.project.utils.Constant.TIME_SHORT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
@Slf4j
public class ValidatePageCheckoutOverview implements Question<Boolean> {

    private String checkoutText;

    @Override
    @Subject("{0} visualiza el título mostrado en la página principal #checkoutText")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        actor.attemptsTo(WaitUntil.the(TXT_PAGE_CHECKOUT_OVERVIEW, isVisible()).forNoMoreThan(TIME_SHORT).seconds());
        String getTxtTitlePage = TXT_PAGE_CHECKOUT_OVERVIEW.resolveFor(actor).getText();
        if (getTxtTitlePage.equals(checkoutText)) {
            log.info(getTxtTitlePage);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidatePageCheckoutOverview withParams(String checkoutText) {
        return new ValidatePageCheckoutOverview(checkoutText);
    }
}