package com.javarush.test.level26.lesson15.big01;

import com.javarush.test.level26.lesson15.big01.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static Operation askOperation() throws InterruptOperationException {
        while (true) {
            String line = readString();

            Pattern p = Pattern.compile("^[1-4]$");
            Matcher m = p.matcher(line);

            if (m.matches())
                return Operation.getAllowableOperationByOrdinal(Integer.parseInt(line));
            else
                writeMessage("invalid data");
        }
    }
}
