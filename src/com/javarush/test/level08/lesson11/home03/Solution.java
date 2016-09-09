package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();

        people.put("Иванов", "Иван");
        people.put("Петров", "Иван");
        people.put("Сидоров", "Иван");
        people.put("Васильев", "Андрей");
        people.put("Кузнецов", "Сергей");
        people.put("Иванов", "Пётр");
        people.put("Петров", "Илья");
        people.put("Сидоров", "Максим");
        people.put("Петрова", "Маша");
        people.put("Сидорова", "Даша");

        return people;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
