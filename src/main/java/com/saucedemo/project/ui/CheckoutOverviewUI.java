package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewUI extends PageObject {

    public static final Target TXT_PAGE_CHECKOUT_OVERVIEW = Target.the("obtiene el texto Checkout: Overview")
            .located(By.xpath("//span[@class='title']"));

    public static final Target BTN_FINISH = Target.the("selecciona el boton finalizar")
            .located(By.id("finish"));

}