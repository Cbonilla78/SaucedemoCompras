package com.saucedemo.project.question;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.saucedemo.project.ui.ProductsUI.TXT_AMOUNT_PRODUCTS;

@AllArgsConstructor
@Slf4j
public class ValidateProductAmountToCart implements Question<Boolean> {

    private final int confirmAmount;

    @Override
    @Subject("{0} valida la cantidad de productos dentro del carrito #confirmAmount")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String getAmountProduct  = TXT_AMOUNT_PRODUCTS.resolveFor(actor).getText();
        String txtNumberValidate = String.valueOf(confirmAmount);
        if (txtNumberValidate.equals(getAmountProduct)) {
            log.info(getAmountProduct);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static ValidateProductAmountToCart success(int confirmAmount) {
        return new ValidateProductAmountToCart(confirmAmount);
    }
}