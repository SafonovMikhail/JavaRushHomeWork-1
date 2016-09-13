package com.javarush.test.level14.lesson08.home05;

/**
 * Created by sbt-galushkin-aa on 22.05.2016.
 */
public class Computer
{
    Keyboard keyboard;
    Mouse mouse;
    Monitor monitor;

    public Computer()
    {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.monitor = new Monitor();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard)
    {
        this.keyboard = keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

}
