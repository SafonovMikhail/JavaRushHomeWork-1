package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String firstName;
        private String midleName;
        private String lastName;
        private String address;
        private Boolean sex;
        private Integer age;

        public Human() {
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String midleName, String lastName) {
            this.firstName = firstName;
            this.midleName = midleName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, Boolean sex, Integer age) {
            this.firstName = firstName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, Boolean sex) {
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(String firstName, Integer age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, String midleName, String lastName, String address) {
            this.firstName = firstName;
            this.midleName = midleName;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String firstName, String midleName, String lastName, String address, Boolean sex) {
            this.firstName = firstName;
            this.midleName = midleName;
            this.lastName = lastName;
            this.address = address;
            this.sex = sex;
        }

        public Human(String firstName, String midleName, String lastName, String address, Boolean sex, Integer age) {
            this.firstName = firstName;
            this.midleName = midleName;
            this.lastName = lastName;
            this.address = address;
            this.sex = sex;
            this.age = age;
        }
    }
}
