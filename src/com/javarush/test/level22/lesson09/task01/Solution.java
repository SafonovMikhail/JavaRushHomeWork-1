package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution
{
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()),"UTF-8"));
        reader.close();

        ArrayList<String> stringline = new ArrayList<String>();

        while(in.ready()){
            stringline.addAll(Arrays.asList((in.readLine().split(" "))));
        }
        in.close();

        Map<String, String> pairs = new HashMap<>();
        for (int i = 0; i < stringline.size(); i++) {
            String usual = stringline.get(i);
            StringBuilder stringBuilder = new StringBuilder(usual);
            String reverseStr = stringBuilder.reverse().toString();

            {
                for (int j = i + 1; j < stringline.size(); j++) {
                    if (pairs.containsKey(usual)) {continue;}
                    if (pairs.containsKey(reverseStr)) {continue;}


                    StringBuilder sb = new StringBuilder(stringline.get(j));
                    String reverse = sb.reverse().toString();

                    if (usual.equals(reverse)) {
                        pairs.put(usual, sb.reverse().toString());
                    }
                }
            }
        }

        for(Map.Entry<String,String> entry: pairs.entrySet()) {
            Pair pair = new Pair();
            pair.first = entry.getKey(); pair.second=entry.getValue();
            result.add(pair);
        }
        for (Pair p: result) {
            System.out.println(p.first + " "  + p.second);
        }
    }



    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}