package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        ArrayList<String> sortString =new ArrayList<>();
        ArrayList<String> sortNumber =new ArrayList<>();

        // 1. разбираем массив
        for (String currentString : array) {
            if (isNumber(currentString)) {
                sortNumber.add(currentString);
            } else {
                sortString.add(currentString);
            }
        }

        // 2. сортируем числа
        sortNumberArray(sortNumber);

        // 3. сортируем строки
        sortStringArray(sortString);

        // 4. собираем всё вместе
        String[] newArray = array.clone();
        int iNumber = 0;
        int iString = 0;

        for (int i = 0; i < newArray.length; i++) {
            String currentString = array[i];
            if (isNumber(currentString)) {
                array[i] = sortNumber.get(iNumber);
                iNumber++;
            } else {
                array[i] = sortString.get(iString);
                iString++;
            }
        }

    }

    public static void sortNumberArray(ArrayList<String> array) {
        String currentRecord;
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size(); j++) {
                if (Integer.parseInt(array.get(j)) > Integer.parseInt(array.get(j - 1))) {
                    currentRecord = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, currentRecord);
                }
            }
        }
    }

    public static void sortStringArray(ArrayList<String> array) {
        String currentRecord;
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size(); j++) {
                if (isGreaterThan(array.get(j - 1), array.get(j))) {
                    currentRecord = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, currentRecord);
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
