package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import javax.management.ObjectName;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> array = new ArrayList<>();
        Integer currentInt = 0;

        // читаем
        String s;
        while ((s = in.readLine()) != null) {
            currentInt = Integer.parseInt(s);
            if (currentInt % 2 == 0)
                array.add(currentInt);
        }

        // сортируем
        Collections.sort(array);

        // выводим
        for (Integer integer : array)
        {
            System.out.println(integer);
        }

        in.close();
    }
}
