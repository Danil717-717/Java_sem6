import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cat {
    int age;
    String name;
    List<String> seekStory;
    long passport;
    Doctor doctor;

    public Cat(String name){
        this.name = name;
        seekStory = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public String toString(){
//        return super.toString();
//        // super обращени к родительскому классу
//    }


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
}
