package com.javarush.test.level26.lesson15.big01;

import java.util.Map;

public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if(denominations.containsKey(denomination))
            denominations.put(denomination, denominations.get(denomination) + count);
        else
            denominations.put(denomination, count);
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
