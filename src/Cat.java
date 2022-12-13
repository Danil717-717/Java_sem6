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
//        // super обращени к родительскому классу
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
        if (this == obj) {    //если обекты хран€тс€ в одном участке пам€ти
            return true;
        }
        if (!(obj instanceof Cat)) {  //первым делом вообще проверить что переданный обьект €вл€етс€ кошкой
            return false;            // instanceof провер€ет на совпадение класса
        }
        Cat cat = (Cat) obj;   // если обьект €вл€етс€ —at то делаем €вное преобразование
        // после этого €вного преобразов теперь можно пользоватьс€ функци€ми
                 // сравниваем имена обьектов    и паспорта this тек обьект == обект пришедший дл€ сравнени€
        if (this.getName().equals(cat.getName()) && this.passport == cat.getPassport()) {
            return true;
        } // мы решили что если одинаковые имена и одинаковый пасспорт то котики одинаковые
        return false;
    }
}

