package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            String s = ConsoleHelper.askCurrencyCode();
            String[] w = ConsoleHelper.getValidTwoDigits(s);
            int k = Integer.valueOf(w[0]);
            int l = Integer.valueOf(w[1]);
            CurrencyManipulator cm = new CurrencyManipulator(s);
            cm.addAmount(k, l);

        } catch (InterruptOperationException e) {
            e.printStackTrace();
        }

    }
}
