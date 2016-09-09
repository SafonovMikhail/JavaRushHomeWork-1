package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Man", new Date("MARCH 1 1980"));
        map.put("Girl", new Date("JULY 1 1980"));
        map.put("Wooman", new Date("JANUARY 1 1980"));
        map.put("Batman", new Date("JANUARY 10 1980"));
        map.put("Dog", new Date("JANUARY 9 1980"));
        map.put("Cat", new Date("JANUARY 8 1980"));
        map.put("Mouse", new Date("JANUARY 7 1980"));
        map.put("Bird", new Date("JANUARY 6 1980"));
        map.put("Fish", new Date("JANUARY 5 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<String>();
        for (Map.Entry<String, Date> val: map.entrySet()) {
            if (val.getValue().getMonth() > 4 && val.getValue().getMonth() < 8) names.add(val.getKey());
        }

        for (String key: names) map.remove(key);

        for (String key : map.keySet())
        {
            System.out.println(key);
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, Date> hashMap = createMap();
        removeAllSummerPeople(hashMap);
    }
}
