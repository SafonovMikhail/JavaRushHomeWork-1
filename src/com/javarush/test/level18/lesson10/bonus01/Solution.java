package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e")) encryptionMethod(args[1], args[2]);
        if (args[0].equals("-d")) decryptionMethod(args[1], args[2]);
    }


    public static void encryptionMethod(String fileName, String fileOutputName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        FileOutputStream output = new FileOutputStream(fileOutputName);
        byte[] buff = null;
        int[] buffer = null;
        byte enc = 10;
        if (input.available() > 0)
        {
            buff = new byte[input.available()];
            buffer = new int[input.available()];
            input.read(buff);
            for (int i = 0; i < buffer.length; i++) buffer[i] = buff[i] - 10;
            for (int i = 0; i < buff.length; i++) buff[i] = (byte) buffer[i];
            output.write(buff);
        }
        input.close();
        output.close();
    }
    public static void decryptionMethod(String fileName, String fileOutputName) throws IOException {
        FileInputStream input = new FileInputStream(fileName);
        FileOutputStream output = new FileOutputStream(fileOutputName);
        byte[] buff = null;
        int[] buffer = null;
        char[] chr = null;
        if (input.available() > 0)
        {
            buff = new byte[input.available()];
            buffer = new int[input.available()];
            chr = new char[input.available()];
            input.read(buff);
            for (int i = 0; i < buffer.length; i++) buffer[i] = buff[i] + 10;
            for (int i = 0; i < chr.length; i++) chr[i] = (char) buffer[i];
            for (int i = 0; i < buff.length; i++) buff[i] = (byte) chr[i];
            output.write(buff);
        }
        input.close();
        output.close();
    }

}
