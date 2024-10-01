package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class YourCartUI extends PageObject {

    public static final Target BTN_YOUR_CART = Target.the("cantidad de productos dentro del carrito")
            .located(By.xpath("//a[@class='shopping_cart_link']"));

    private static List<WebElement> locatorListProductsInYourCart() {
        String xpath = "//div[@class='cart_item_label']";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static List<WebElement> getLocatorListProductsInYourCart() {
        return locatorListProductsInYourCart();
    }

    public static final Target BTN_CHECKOUT = Target.the("presiona el boton verificar")
            .located(By.id("checkout"));
}
