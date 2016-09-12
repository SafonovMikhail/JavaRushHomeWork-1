package com.javarush.test.level12.lesson04.task01;

/* print(int) и print(String)
Написать два метода: print(int) и print(String).
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(1);
        print("s");
    }

    //Напишите тут ваши методы
    static void print(int i) {
        System.out.println(String.valueOf(i));
    }

    static void print(String s) {
        System.out.println(s);
    }
}
