/*
   �������� ��� ���������� ������ ������� ��� �������� ������� - �������� ���� � ������. ����������� � java.
   ������� ��������� ���������.
   �������� �����, ������� ����� ����������� � ������������ �������� (��� ��������) ���������� � ������� ��������,
   ���������� �������. �������� ���������� ����� ������� � Map. ��������: �������� �����,
   ��������������� ������������ ��������:
       1 - ���
       2 - ����� ��
       3 - ������������ �������
       4 - ���� �
   ����� ����� ��������� ����������� �������� ��� ��������� ��������� - ��������� ��������� ���������� ����� ����� � Map.
   ������������� �������� �� ��������������� ��������� � ������� ���������� �� ��������.


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
        System.out.println(" 1 - ���");
        System.out.println(" 2 - ����� ��");
        System.out.println(" 3 - ������������ �������");
        System.out.println(" 4 - ����");
        System.out.print("������� �����, ��������������� ������������ ��������:  ");
        int s = scan.nextInt();

        if (s == 1) {
            System.out.println("����� ����� ����������� ������ ����������: 4, 8, 10? ");
            System.out.print("����: ");
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
            System.out.println("����� ����� ������ ����������: 500, 800, 1000? ");
            System.out.print("����: ");
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
            System.out.println("����� ������������ ������� ����������: 1 - Win, 2 - Mac? ");
            System.out.print("����: ");
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
            System.out.println("����� ���� ����������: 1 - �����, 2 - ������? ");
            System.out.print("����: ");
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