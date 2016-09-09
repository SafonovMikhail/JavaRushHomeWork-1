package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Сын 1", true, 27);
        Human child2 = new Human("Дочь 1", false, 25);
        Human child3 = new Human("Дочь 2", false, 20);

        Human father = new Human("Отец", true, 45);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human mother = new Human("Мать", false, 44);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human granFather1 = new Human("Дед 1", true, 70);
        granFather1.children.add(father);

        Human granMother1 = new Human("Бабушка 1", false, 68);
        granMother1.children.add(father);

        Human granFather2 = new Human("Дед 2", true, 71);
        granFather2.children.add(mother);

        Human granMother2 = new Human("Бабушка 2", false, 65);
        granMother2.children.add(mother);

        System.out.println(granFather1);
        System.out.println(granMother1);
        System.out.println(granFather2);
        System.out.println(granMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
