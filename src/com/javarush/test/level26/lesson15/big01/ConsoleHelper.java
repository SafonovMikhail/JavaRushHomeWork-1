package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String message = "";

        try {
            message = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return message;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String inStr;

        while (true) {
            inStr = readString();
            if (inStr.length() == 3)
                break;
            else
                System.out.println("Данные не корректны, введите ещё раз!");

        }

        return inStr.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException
    {
        String[] array;
        System.out.println("Введите номинал и количество");

        while (true) {
            String s = readString();
            array = s.split(" ");
            int k;
            int l;
            try {
                k = Integer.parseInt(array[0]);
                l = Integer.parseInt(array[1]);
            }
            catch (Exception e) {
                System.out.println("Данные не валидны, введите ещё раз");;
                continue;
            }

            if (k <= 0 || l <= 0 || array.length > 2) {
                System.out.println("Данные не валидны, введите ещё раз");;
                continue;
            }

            break;
        }

        return array;
    }

}
