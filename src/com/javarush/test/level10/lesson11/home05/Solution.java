package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код
        HashMap<Character, Integer> charCount = new HashMap<>();
        // 1. заполняем ключи
        for (char chr : abcArray) {
            charCount.put(chr, 0);
        }

        // 2. считаем буквы
        for (String currentString : list) {
            char[] abcString = currentString.toCharArray();
            for (char chr : abcString) {
                try {
                    charCount.put(chr, charCount.get(chr) + 1);
                }
                catch (Exception e) {}
            }
        }

        // 3. выводим
        for (Character chr : alphabet) {
            System.out.println(chr + " " + charCount.get(chr));
        }
    }

}
