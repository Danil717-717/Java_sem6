/*
   1. �������� �����, ������� �������� ������ �� 1000 ��������� ���������� �������
       �� 0 �� 24.
   2. �������� �����, � ������� ��������� ����������� ���� ������ � � �������
       Set ��������� ������� ���������� �������� � ������ ������� � �������
       ��� � ���� ����� � ��������� �������.
   ��� ���������� �������� ����������� �������:
        ������� ���������� ����� = ���������� ���������� ����� * 100 / �����
        ���������� ����� � �������.
*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_02 {
        public static void main(String[] args) {
                System.out.println(unicZnach(generateArrey(1000,0,24)));
        }

        public static Integer[] generateArrey(int size, int min, int max){  //������� ������
                Random random = new Random();                               // �������� ���������
                Integer[] arr = new Integer[size];
                for (int i = 0; i < arr.length; i++) {                       // ��������� ������
                        arr[i] = random.nextInt(min, max + 1);      // �� ��� �� ����(����+1)
                }                            //(max - min + 1) + min; �� � ������� ���� ���������� ������ ������������ �������� �� �����
                                             // ������� ����� ���� � ��������� ���� ����������� ������� �/� ���� ��� 10 24-10=14 + 10= 24
                return arr;
        }
        public  static int unicZnach(Integer[] arr){    // 2. ���������� ������������ ������ � Set
                Set<Integer> set = new HashSet<>(Arrays.asList(arr)); // �������
                System.out.println(Arrays.toString(arr));             // ������ ������� � 1000 ���������
                System.out.println(set);                              // ������ Set � ����������� ����������
                return set.size() * 100/ arr.length;                  // ���������� �������� �� �������
        }
}
