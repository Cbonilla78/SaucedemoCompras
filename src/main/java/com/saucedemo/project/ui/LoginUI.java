package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI extends PageObject {

    /**
    Mapeo de localozadores vista LOGIN
     */

    public static final Target INPUT_USER_NAME = Target.the("ingresa el nombre de usuario")
            .located(By.id("user-name"));

    public static final Target INPUT_PASSWORD = Target.the("ingresa la contraseña")
            .located(By.id("password"));

    public static final Target BUTTON_LOGIN = Target.the("pulsa el boton entrar")
            .located(By.id("login-button"));

    public static final Target TXT_FAILD_CREDENTIALS = Target.the("error!!! usuario o contraseña incorrectos")
            .located(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));

}