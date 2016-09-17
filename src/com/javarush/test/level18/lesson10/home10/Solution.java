package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listNames = new ArrayList<String>();
        while (true){
            String s = bufferedReader.readLine();
            if (s.equals("end")){
                break;
            }
            listNames.add(s);

        }
        bufferedReader.close();


        //разделение имени файла на части, разделитель точка!
        String[] nameMainFile = listNames.get(0).split("\\.");
        File file = new File(nameMainFile[0]+"."+nameMainFile[1]);
        file.createNewFile();


        //вырезаем из имени файла последние цифры и добавление их в список

        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        for (String name: listNames){
            String[] sName = name.split("part");
            sortedList.add(Integer.parseInt(sName[1]));

        }
        //сортировка списка цифр
        Collections.sort(sortedList);

        //создание потока вывода. Цикл по списку цифр, в нем создаем поток ввода, читаем файл из составного имени и записываем в итоговый файл
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nameMainFile[0]+"."+nameMainFile[1]));
        for (int name: sortedList) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nameMainFile[0]+"."+nameMainFile[1]+"."+"part"+name));
            while (bis.available()>0){
                bos.write(bis.read());

            }
            bis.close();
        }
        bos.close();
    }
}
