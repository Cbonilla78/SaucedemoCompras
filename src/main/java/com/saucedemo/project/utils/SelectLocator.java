package com.saucedemo.project.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static com.saucedemo.project.ui.ProductsUI.getLocatorListProducts;
import static com.saucedemo.project.ui.YourCartUI.getLocatorListProductsInYourCart;
import static com.saucedemo.project.utils.Constant.ONE;
import static com.saucedemo.project.utils.WebActions.click;

public class SelectLocator {

    private SelectLocator() {
    }

    private static Faker faker = Faker.instance(new Locale("es", "EC"), new Random());

    private static int getProductsRandom() {
        return faker.number().numberBetween(ONE, getLocatorListProducts().size());
    }

    public static void selectRandomProducts() {
        click(getLocatorListProducts().get(getProductsRandom()));
    }

    public static int getAmountYourCart() {
        return getLocatorListProductsInYourCart().size();
    }
}