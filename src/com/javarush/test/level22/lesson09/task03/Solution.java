package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        reader.close();

        ArrayList<String> stringline = new ArrayList<String>();

        while(in.ready()){
            stringline.addAll(Arrays.asList((in.readLine().split(" "))));
        }
        in.close();

        String[] words = new String[stringline.size()];
        words = stringline.toArray(words);

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        List<String> strings  = new ArrayList<>();
        Collections.addAll(strings, words);
        StringBuilder sb = new StringBuilder();

        if (strings.size() == 0)
            return new StringBuilder();

        sb.append(strings.get(0));
        strings.remove(0);

        while (strings.size() > 0){
            String lastChar = String.valueOf(sb.charAt(sb.length() - 1)).toUpperCase();

            int i = 0;
            for (String string : strings) {
                if (string.substring(0, 1).toUpperCase().equals(lastChar)) {
                    strings.remove(i);
                    sb.append(' ');
                    sb.append(string);
                    break;
                }

                i++;
            }
        }

        return sb;
    }
}
