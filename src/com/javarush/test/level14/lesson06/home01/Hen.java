package com.javarush.test.level14.lesson06.home01;

/**
 * Created by sbt-galushkin-aa on 19.05.2016.
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я курица.";
    }
}
