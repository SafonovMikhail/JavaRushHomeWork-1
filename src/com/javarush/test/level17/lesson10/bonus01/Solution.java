package com.javarush.test.level17.lesson10.bonus01;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat dateInFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat dateOutFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void create(String name, String sex, String db) throws ParseException {
        if (sex.equals("м"))
            allPeople.add(Person.createMale(name, dateInFormat.parse(db)));
        else
            allPeople.add(Person.createFemale(name, dateInFormat.parse(db)));
        System.out.println(allPeople.size()-1); // выводим "индекс" последнего
    }

    public static void update(String strID, String name, String sex, String db) throws ParseException {
        int id = Integer.parseInt(strID);
        allPeople.get(id).setName(name);
        allPeople.get(id).setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
        allPeople.get(id).setBirthDay(dateInFormat.parse(db));
    }

    public static void delete(String strID){
        int id = Integer.parseInt(strID);
        //allPeople.remove(id);
        allPeople.get(id).setBirthDay(null);
    }

    public static void information(String strID){
        int id = Integer.parseInt(strID);
        System.out.println(allPeople.get(id).getName() +
                ((allPeople.get(id).getSex() == Sex.MALE) ? " м " : " ж ") +
                dateOutFormat.format(allPeople.get(id).getBirthDay()));
    }

    public static void main(String[] args) throws IOException, ParseException {
        //start here - начни тут

        switch (args[0]) {
            case "-c": {
                create(args[1], args[2], args[3]);
                break;
            }
            case "-u": {
                update(args[1], args[2], args[3], args[4]);
                break;
            }
            case "-d": {
                delete(args[1]);
                break;
            }
            case "-i": {
                information(args[1]);
                break;
            }
        }
    }
}
