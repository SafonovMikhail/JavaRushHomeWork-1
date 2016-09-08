package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int n2 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int n3 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (n2 > n1) {
            n = n1;
            n1 = n2;
            n2 = n;
        }

        if (n3 > n2) {
            n = n2;
            n2 = n3;
            n3 = n;
        }

        if (n2 > n1) {
            n = n1;
            n1 = n2;
            n2 = n;
        }

        if (n3 > n2) {
            n = n2;
            n2 = n3;
            n3 = n;
        }

        System.out.println(n2);
    }
}
