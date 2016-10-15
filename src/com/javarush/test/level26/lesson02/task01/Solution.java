package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        final double median;

        if (array.length % 2 == 0) {
            median = ((double) array[array.length / 2 - 1] + (double) array[array.length / 2]) / 2;
        } else {
            median = array[array.length / 2];
        }

        Comparator<Integer> compareByMedian = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i1, Integer i2) {
                double value = Math.abs(i1 - median) - Math.abs(i2 - median);

                if (value == 0)
                    value = i1 - i2;

                return (int) value;
            }
        };

        Arrays.sort(array, compareByMedian);

        return array;
    }

    public static void main (String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
    }
}
