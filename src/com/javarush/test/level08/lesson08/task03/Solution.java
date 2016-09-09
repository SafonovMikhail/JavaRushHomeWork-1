package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Иванов", "Иван");
        hashMap.put("Иванова", "Анна");
        hashMap.put("Петров", "Пётр");
        hashMap.put("Петрова", "Ирина");
        hashMap.put("Сидоров", "Иван");
        hashMap.put("Сидорова", "Ирина");
        hashMap.put("Кузнецов", "Пётр");
        hashMap.put("Кузнецова", "Ирина");
        hashMap.put("Васильев", "Пётр");
        hashMap.put("Васильева", "Ирина");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name))
                count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        if (map.containsKey(lastName))
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        HashMap map = createMap();
        System.out.println("Количество фамилий Петров - " + getCountTheSameLastName(map, "Петров"));
        System.out.println("Количество фамилий Иванкина - " + getCountTheSameLastName(map, "Иванкина"));
        System.out.println("Количество имён Ирина - " + getCountTheSameFirstName(map, "Ирина"));
        System.out.println("Количество имён Ольга - " + getCountTheSameFirstName(map, "Ольга"));
    }
}
