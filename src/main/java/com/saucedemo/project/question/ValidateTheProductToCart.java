package com.saucedemo.project.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import static com.saucedemo.project.utils.SelectLocator.getAmountYourCart;


@AllArgsConstructor
@Slf4j
public class ValidateTheProductToCart implements Question<Boolean> {

    private final int confirmAmount;

    @Override
    @Subject("{0} valida la cantidad de productos dentro del carrito #confirmAmount")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String getAmountProduct  = String.valueOf(getAmountYourCart());
        String txtNumberValidate = String.valueOf(confirmAmount);
        if (txtNumberValidate.equals(getAmountProduct)) {
            log.info(getAmountProduct);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidateTheProductToCart success(int confirmAmount) {
        return new ValidateTheProductToCart(confirmAmount);
    }
}