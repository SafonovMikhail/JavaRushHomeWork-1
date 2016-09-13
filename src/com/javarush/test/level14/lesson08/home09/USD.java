package com.javarush.test.level14.lesson08.home09;

/**
 * Created by sbt-galushkin-aa on 23.05.2016.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
