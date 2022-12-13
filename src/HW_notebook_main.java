/*
   Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
   Создать множество ноутбуков.
   Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
   отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
   соответствующую необходимому критерию:
       1 - ОЗУ
       2 - Объем ЖД
       3 - Операционная система
       4 - Цвет …
   Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
   Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.


 */

import java.util.*;

public class HW_notebook_main {

    public static void main(String[] args) {

        HW_Notebook notebook1 = new HW_Notebook("HP 01");
        notebook1.setModel("HP 01");
        notebook1.setRAM(8);
        notebook1.setHardDiskCapacity(500);
        notebook1.setOperatingSystem("Win");
        notebook1.setColor("black");

        HW_Notebook notebook2 = new HW_Notebook("HP 02");
        notebook2.setModel("HP 02");
        notebook2.setRAM(10);
        notebook2.setHardDiskCapacity(800);
        notebook2.setOperatingSystem("Win");
        notebook2.setColor("white");

        HW_Notebook notebook3 = new HW_Notebook("Acer 01");
        notebook3.setModel("Acer 01");
        notebook3.setRAM(4);
        notebook3.setHardDiskCapacity(500);
        notebook3.setOperatingSystem("Win");
        notebook3.setColor("black");

        HW_Notebook notebook4 = new HW_Notebook("Acer 02");
        notebook4.setModel("Acer 02");
        notebook4.setRAM(8);
        notebook4.setHardDiskCapacity(1000);
        notebook4.setOperatingSystem("Win");
        notebook4.setColor("white");

        HW_Notebook notebook5 = new HW_Notebook("MacBook 01");
        notebook5.setModel("MacBook 01");
        notebook5.setRAM(8);
        notebook5.setHardDiskCapacity(500);
        notebook5.setOperatingSystem("Mac");
        notebook5.setColor("black");

        HW_Notebook notebook6 = new HW_Notebook("MacBook 02");
        notebook6.setModel("MacBook 02");
        notebook6.setRAM(10);
        notebook6.setHardDiskCapacity(1000);
        notebook6.setOperatingSystem("Mac");
        notebook6.setColor("white");

        Map<Integer, HW_Notebook> notebooks = new HashMap();
        notebooks.put(1, notebook1);
        notebooks.put(2, notebook2);
        notebooks.put(3, notebook3);
        notebooks.put(4, notebook4);
        notebooks.put(5, notebook5);
        notebooks.put(6, notebook6);

        //System.out.println(notebooks);


        Scanner scan = new Scanner(System.in);
        System.out.println(" 1 - ОЗУ");
        System.out.println(" 2 - Обьем ЖД");
        System.out.println(" 3 - Операционная система");
        System.out.println(" 4 - Цвет");
        System.out.print("Введите цифру, соответствующую необходимому критерию:  ");
        int s = scan.nextInt();

        if (s == 1) {
            System.out.println("Какой обьем оперативной памяти интересует: 4, 8, 10? ");
            System.out.print("Ввод: ");
            int b = scan.nextInt();
            if (b == 4) {
                System.out.println(notebooks.get(3));

            } else if (b == 8){
                System.out.println(notebooks.get(1));
                System.out.println(notebooks.get(4));
                System.out.println(notebooks.get(5));

            } else if (b == 10){
                System.out.println(notebooks.get(2));
                System.out.println(notebooks.get(6));
            }else {
                return;
            }
        }
        if (s == 2) {
            System.out.println("Какой обьем памяти интересует: 500, 800, 1000? ");
            System.out.print("Ввод: ");
            int b = scan.nextInt();
            if (b == 500) {
                System.out.println(notebooks.get(1));
                System.out.println(notebooks.get(3));
                System.out.println(notebooks.get(5));

            } else if (b == 800){
                System.out.println(notebooks.get(2));

            } else if (b == 1000){
                System.out.println(notebooks.get(4));
                System.out.println(notebooks.get(6));
            }else {
                return;
            }
        }
        if (s == 3) {
            System.out.println("Какая операционная система интересует: 1 - Win, 2 - Mac? ");
            System.out.print("Ввод: ");
            int b = scan.nextInt();
            if (b == 1) {
                System.out.println(notebooks.get(1));
                System.out.println(notebooks.get(2));
                System.out.println(notebooks.get(3));
                System.out.println(notebooks.get(4));
            } else if (b == 2){
                System.out.println(notebooks.get(5));
                System.out.println(notebooks.get(6));

            }else {
                return;
            }
        }

        if (s == 4) {
            System.out.println("Какая цвет интересует: 1 - белый, 2 - черный? ");
            System.out.print("Ввод: ");
            int b = scan.nextInt();
            if (b == 1) {
                System.out.println(notebooks.get(2));
                System.out.println(notebooks.get(4));
                System.out.println(notebooks.get(6));
            }
            else if (b == 2) {
                System.out.println(notebooks.get(1));
                System.out.println(notebooks.get(3));
                System.out.println(notebooks.get(5));
            } else {
                return;
            }

        }





    }
}