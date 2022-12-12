import java.util.*;

/*
1. �������� HashSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}.
������������ ���������� ������� ���������.
2. �������� LinkedHashSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}.
������������ ���������� ������� ���������.
3. �������� TreeSet, ��������� ��� ���������� �������: {1, 2, 3, 2, 4, 5, 6, 3}.
������������ ���������� ������� ���������.

*/
public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,2,3,2,5,4,6,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        System.out.println(set1);     // HashSet ��������� �� ������� � ���������� ������ ���������� ��������
                                      // �� �������� �����, ������ �� ����� �� ������� ���� �����

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set2);    // Linked ��������� ������� � ���������� ���������� ��������

        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set3);   // ��� HeshSet ������ ���� ��������� ���������


    }
}