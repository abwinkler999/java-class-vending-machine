package com.awesomevendingco.vendingmachine.products;

import java.util.HashMap;
import java.util.Map;

public class ProductValuatorImpl implements ProductValuator {

    private Map<String, Double> productPrices = new HashMap<String, Double>();

    public void setProductPrices(Map<String, Double> productPrices) {
        this.productPrices = productPrices;
    }

    public double lookupProduct(String product) {
        Double price = productPrices.get(product);
        if (price == null)
            throw new InvalidProductException();
        return price;
    }

}
