package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arrayAll = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> arrayOther = new ArrayList<>();

        Boolean addToOther;

        for (int i = 0; i < 20; i++) {
            arrayAll.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < arrayAll.size(); i++) {
            addToOther = true;
            if (arrayAll.get(i) % 3 == 0) {
                array3.add(arrayAll.get(i));
                addToOther = false;
            }

            if (arrayAll.get(i) % 2 == 0) {
                array2.add(arrayAll.get(i));
                addToOther = false;
            }

            if (addToOther) {
                arrayOther.add(arrayAll.get(i));
            }
        }

        printList(array3);
        printList(array2);
        printList(arrayOther);
    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
