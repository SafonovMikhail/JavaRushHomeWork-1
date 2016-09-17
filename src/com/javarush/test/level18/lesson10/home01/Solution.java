package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream readFile = new FileInputStream(args[0]);
        int count = 0;

        while(readFile.available() > 0){
            char ch = (char) readFile.read();
            if (Character.toUpperCase(ch) >= 'A' & Character.toUpperCase(ch) <= 'Z') {
                count++;
            }
        }

        System.out.println(count);

        readFile.close();
    }
}
