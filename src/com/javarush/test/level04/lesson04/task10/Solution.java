package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int num2 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int num3 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (num1 == num2 && num1 != num3) {
            System.out.println(num1 + " " + num2);
        }

        if (num2 == num3 && num1 != num2) {
            System.out.println(num2 + " " + num3);
        }

        if (num1 == num3 && num1 != num2) {
            System.out.println(num1 + " " + num3);
        }

        if (num1 == num2 && num2 == num3) {
            System.out.println(num1 + " " +num2 + " " + num3);
        }

    }
}