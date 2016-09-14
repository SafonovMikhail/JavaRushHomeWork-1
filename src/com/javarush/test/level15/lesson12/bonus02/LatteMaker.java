package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by sbt-galushkin-aa on 02.06.2016.
 */
public class LatteMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient()
    {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем молоком с пенкой");
    }

    @Override
    public void makeDrink()
    {
        super.makeDrink();
    }
}
