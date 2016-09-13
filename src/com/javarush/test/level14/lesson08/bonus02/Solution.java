package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        List<Integer> nod1 = new ArrayList<>();
        List<Integer> nod2 = new ArrayList<>();

        for (int i = 1; i <= num1/2; i++) {
            if (num1%i == 0) { nod1.add(i); }
        }
        nod1.add(num1);

        for (int i = 1; i <= num2/2; i++) {
            if (num2%i == 0) { nod2.add(i); }
        }
        nod2.add(num2);

        Integer maxNod = 1;
        for (Integer integer1 : nod1)
        {
            if (nod2.contains(integer1)) {maxNod = integer1; }
        }

        System.out.println(maxNod);
    }
}
