package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name, color;
    int high;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, int high)
    {
        this.name = name;
        this.high = high;
    }

    public Dog(String name, String color, int high)
    {
        this.name = name;
        this.color = color;
        this.high = high;
    }

    public static void main(String[] args)
    {
        Dog dog = new Dog("Dog");
    }
}
