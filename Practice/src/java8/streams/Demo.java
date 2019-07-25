package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
    int id;
    int age;

    public Emp(int id, int age) {

        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Demo {

    public static void main(String args[]) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(1, 20));
        list.add(new Emp(2, 40));
        list.add(new Emp(3, 30));
        list.add(new Emp(4, 50));
        list.add(new Emp(5, 20));

        List<Integer> l = list.stream().map(t -> t.getAge()).distinct().collect(Collectors.toList());
        System.out.print(l);
    }
}
