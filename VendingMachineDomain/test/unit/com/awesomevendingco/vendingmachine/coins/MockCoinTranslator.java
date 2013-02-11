package com.awesomevendingco.vendingmachine.coins;


public class MockCoinTranslator implements CoinTranslator {

    public static final String BAD_COIN = "BAD_COIN";
    public static final String GOOD_COIN = "COIN";

    public double valuateCoin(String coin) {
        if (coin.equals("COIN"))
            return 0.45;
        throw new InvalidCoinException();
    }

}