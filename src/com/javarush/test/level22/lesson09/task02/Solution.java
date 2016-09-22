package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> where = new HashMap<>();
        where.put("name", "Ivanov");
        where.put("country", "Ukraine");
        where.put("city", "Kiev");
        where.put("age", null);

        System.out.println(getCondition(where));
    }

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder condition = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (condition.toString().equals(""))
                    condition.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                else
                    condition.append(" and ").append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
            }
        }

        //return condition;
        return condition;
    }
}
