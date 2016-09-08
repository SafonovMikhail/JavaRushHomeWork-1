package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
            System.out.println("3");
        }

        if (num1 == num3 && num1 != num2) {
            System.out.println("2");
        }

        if (num2 == num3 && num1 != num3) {
            System.out.println("1");
        }

    }
}
