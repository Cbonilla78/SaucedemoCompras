package com.saucedemo.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProductsUI extends PageObject {

    /**
     * Mapeo de localozadores vista HOME - PRODUCTS
     * Este elemento locatorListProducts es un localizador de tipo lista el cual me permite interactuar
     * con el tamaño, con el fin de seleccionar cual quiera de los productos de forma random
     */

    private static List<WebElement> locatorListProducts() {
        String xpath = "//button[starts-with(@id,'add-to-cart')]";
        return BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().findElements(By.xpath(xpath));
    }

    public static List<WebElement> getLocatorListProducts() {
        return locatorListProducts();
    }

    public static final Target BTN_SHOPPING_CART = Target.the("ingresa carrito de compras")
            .located(By.xpath("//a[@class='shopping_cart_link']"));

    public static final Target TXT_AMOUNT_PRODUCTS = Target.the("cantidad de productos dentro del carrito")
            .located(By.xpath("//span[@class='shopping_cart_badge']"));

}