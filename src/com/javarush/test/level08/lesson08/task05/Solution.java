package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap <String, String> map = new HashMap<>();

        map.put("LastName0", "FirstName0");
        map.put("LastName1", "FirstName1");
        map.put("LastName2", "FirstName2");
        map.put("LastName3", "FirstName3");
        map.put("LastName4", "FirstName4");
        map.put("LastName5", "FirstName5");
        map.put("LastName6", "FirstName5");
        map.put("LastName7", "FirstName6");
        map.put("LastName8", "FirstName6");
        map.put("LastName9", "FirstName6");

        return map;
    }

    public static int countOfValue (HashMap<String, String> map, String value) {
        int count = 0;

        for (String mapValue : map.values())
        {
            if (mapValue.equals(value)) ++count;
        }

        return count;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String name : copy.values()) {
            if (countOfValue(map, name) > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
