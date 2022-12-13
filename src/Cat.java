import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat {
    private int age;
    private String name;
    private List<String> seekStory;
    private long passport;
    private Doctor doctor;

    public Cat(String name) {
        this.name = name;
        seekStory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public String toString(){
//        return super.toString();
//        // super �������� � ������������� ������
//    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", seekStory=" + seekStory +
                ", passport=" + passport +
                ", doctor=" + doctor +
                '}';
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public long getPassport() {
        return passport;
    }




    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {    //���� ������ �������� � ����� ������� ������
            return true;
        }
        if (!(obj instanceof Cat)) {  //������ ����� ������ ��������� ��� ���������� ������ �������� ������
            return false;            // instanceof ��������� �� ���������� ������
        }
        Cat cat = (Cat) obj;   // ���� ������ �������� �at �� ������ ����� ��������������
        // ����� ����� ������ ���������� ������ ����� ������������ ���������
                 // ���������� ����� ��������    � �������� this ��� ������ == ����� ��������� ��� ���������
        if (this.getName().equals(cat.getName()) && this.passport == cat.getPassport()) {
            return true;
        } // �� ������ ��� ���� ���������� ����� � ���������� �������� �� ������ ����������
        return false;
    }
}

