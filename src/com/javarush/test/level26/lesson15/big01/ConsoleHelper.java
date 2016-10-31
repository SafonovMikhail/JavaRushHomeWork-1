package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String s = "";

        try {
            s = reader.readLine();
        } catch (IOException e) {

        }
        return s;
    }

    public static String askCurrencyCode() {
        String code;

        writeMessage("Input currency code:");

        while (true){
            code = readString();
            if(code.matches("\\w{3}")){
                break;
            }else
                writeMessage("Invalid currency code, retry.");
        }

        return code.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) {

        String valueAndAmount;
        String[] result;
        writeMessage("Input nominal and amount:");

        while (true) {
            valueAndAmount = readString();
            if (valueAndAmount.matches("\\d+ \\d+")) {
                result = valueAndAmount.split(" ");
                if(result[0].equals("0") || result[1].equals("0")){
                    writeMessage("Invalid nominal and amount, retry.");
                    continue;
                }
                return result;
            } else{
                writeMessage("Invalid nominal and amount, retry.");
            }
        }
    }

    public static Operation askOperation() {
        boolean correctInput = false;
        Operation chosenOperation = Operation.INFO;

        while (!correctInput) {
            writeMessage("Выберите вашу операцию 1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT: ");
            String input = readString();
            int choise;

            try {
                choise = Integer.valueOf(input.trim());
                chosenOperation = Operation.getAllowableOperationByOrdinal(choise);
                correctInput = true;
            } catch (IllegalArgumentException e) {
            }
        }

        return chosenOperation;

    }
}
