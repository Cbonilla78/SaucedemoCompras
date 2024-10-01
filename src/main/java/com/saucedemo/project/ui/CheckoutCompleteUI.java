package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompleteUI extends PageObject {

    public static final Target TXT_MENSSAGE_COMPLETE_ORDER = Target.the("obtiene el texto ¡Gracias por su orden!")
            .located(By.xpath("//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]"));

}