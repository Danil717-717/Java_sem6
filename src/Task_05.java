import java.util.HashSet;
import java.util.Set;

/*
1. �������� ���������, � ������� ����� ��������� ���������� ������ Cat - HashSet<Cat>.
   ��������� � ���� ��������� ���������� ��������.
2. �������� 2 ��� ����� ����� � ����������� ����������� � �����.
   ��������� �� �� ���������. ���������, ��� ��� ��� ����������� �� ���������.
3. �������� ����� public boolean equals(Object o)
   ��������� � �� ������ ��������� ����� �� ����������, �������� � �����.
   �� ����, ����� ������ ���������� true, ������ ���� �������� �� ���� �����
   ������������ �������� �����.
4. �������� ����� ���������� ��������� �� ������ 2,
   ���������, ��� ��������� ���������.



 */
public class Task_05 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsic");
        cat1.setAge(10);
        cat1.setPassport(12345);
        cat1.setDoctor(new Doctor("Vasa"));

        Cat cat2 = new Cat("Vaska");
        cat1.setAge(15);
        cat1.setPassport(10001);
        cat1.setDoctor(new Doctor("Vasa"));

        Cat cat3 = new Cat("gh");
        Set<Cat> cats = new HashSet<>();
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);
        //System.out.println(cat2.equals(cat3));  // ��� ������� ���������� ���� ������������ ����� equals

    }
}
