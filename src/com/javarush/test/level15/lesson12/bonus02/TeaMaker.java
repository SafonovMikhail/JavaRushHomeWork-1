package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by sbt-galushkin-aa on 02.06.2016.
 */
public class TeaMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем водой");
    }

    @Override
    public void makeDrink()
    {
        super.makeDrink();
    }
}
