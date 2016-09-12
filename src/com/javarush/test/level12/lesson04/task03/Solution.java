package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution
{
    public static void main(String[] args)
    {
        print((Integer) 1);
        print((Long) 1l);
        print((Double) 1d);
        print((Float) 1f);
        print((String) "s");
    }

    //Напишите тут ваши методы
    private static void print(Integer s) {
        System.out.println(s.toString());
    }

    private static void print(Long s) {
        System.out.println(s.toString());
    }

    private static void print(Double s) {
        System.out.println(s.toString());
    }

    private static void print(Float s) {
        System.out.println(s.toString());
    }

    private static void print(String s) {
        System.out.println(s.toString());
    }
}
