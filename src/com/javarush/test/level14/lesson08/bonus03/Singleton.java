package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by sbt-galushkin-aa on 23.05.2016.
 */
public class Singleton
{
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {singleton = new Singleton();}
        return singleton;
    }

    private Singleton()
    {
    }
}
