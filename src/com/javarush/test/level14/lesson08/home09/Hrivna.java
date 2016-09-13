package com.javarush.test.level14.lesson08.home09;

import com.javarush.test.level14.lesson08.home09.Money;

/**
 * Created by sbt-galushkin-aa on 23.05.2016.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
