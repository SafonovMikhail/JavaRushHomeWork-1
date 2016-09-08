package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = array.size(); i > 0; i--) {
            System.out.println(array.get(i - 1));
        }
    }
}
