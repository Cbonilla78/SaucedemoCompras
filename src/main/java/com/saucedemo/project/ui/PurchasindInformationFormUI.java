package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasindInformationFormUI extends PageObject {

    public static final Target INPUT_NAMES = Target.the("ingresa el nombre completo")
            .located(By.id("first-name"));

    public static final Target INPUT_LAST_NAME = Target.the("ingresa los apellidos")
            .located(By.id("last-name"));

    public static final Target INPUT_CODE_POSTAL = Target.the("ingresa el codigo postal")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE = Target.the("presiona boton continuar")
            .located(By.id("continue"));

}
