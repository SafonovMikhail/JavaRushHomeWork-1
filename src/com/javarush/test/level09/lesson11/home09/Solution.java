package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Cat0", new Cat("Cat0"));
        catMap.put("Cat1", new Cat("Cat1"));
        catMap.put("Cat2", new Cat("Cat2"));
        catMap.put("Cat3", new Cat("Cat3"));
        catMap.put("Cat4", new Cat("Cat4"));
        catMap.put("Cat5", new Cat("Cat5"));
        catMap.put("Cat6", new Cat("Cat6"));
        catMap.put("Cat7", new Cat("Cat7"));
        catMap.put("Cat8", new Cat("Cat8"));
        catMap.put("Cat9", new Cat("Cat9"));

        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String, Cat> catEntry : map.entrySet()) {
            cats.add(catEntry.getValue());
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
