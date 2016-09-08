package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg01 = new Zerg();
        zerg01.name = "zerg01";

        Zerg zerg02 = new Zerg();
        zerg02.name = "zerg02";

        Zerg zerg03 = new Zerg();
        zerg03.name = "zerg03";

        Zerg zerg04 = new Zerg();
        zerg04.name = "zerg04";

        Zerg zerg05 = new Zerg();
        zerg05.name = "zerg05";

        Zerg zerg06 = new Zerg();
        zerg06.name = "zerg06";

        Zerg zerg07 = new Zerg();
        zerg07.name = "zerg07";

        Zerg zerg08 = new Zerg();
        zerg08.name = "zerg08";

        Zerg zerg09 = new Zerg();
        zerg09.name = "zerg09";

        Zerg zerg10 = new Zerg();
        zerg10.name = "zerg10";

        Protos protos01 = new Protos();
        protos01.name = "protos01";

        Protos protos02 = new Protos();
        protos02.name = "protos02";

        Protos protos03 = new Protos();
        protos03.name = "protos03";

        Protos protos04 = new Protos();
        protos04.name = "protos04";

        Protos protos05 = new Protos();
        protos05.name = "protos05";

        Terran terran01 = new Terran();
        terran01.name = "terran01";

        Terran terran02 = new Terran();
        terran02.name = "terran02";

        Terran terran03 = new Terran();
        terran03.name = "terran03";

        Terran terran04 = new Terran();
        terran04.name = "terran04";

        Terran terran05 = new Terran();
        terran05.name = "terran05";

        Terran terran06 = new Terran();
        terran06.name = "terran06";

        Terran terran07 = new Terran();
        terran07.name = "terran07";

        Terran terran08 = new Terran();
        terran08.name = "terran08";

        Terran terran09 = new Terran();
        terran09.name = "terran09";

        Terran terran10 = new Terran();
        terran10.name = "terran10";

        Terran terran11 = new Terran();
        terran11.name = "terran11";

        Terran terran12 = new Terran();
        terran12.name = "terran12";
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}