package ch29.java__;

import java.util.*;

public class Origin {
    private String name;
    private int age;

    public Origin(String name, int age){
        this.age=age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main_{
    public static void main(String[] args) {
        List<Origin> origins = new ArrayList<>();
        origins.add(new Origin("kavin",19));

        origins.add(new Origin("david",29));

        origins.add(new Origin("jason",9));


        Collections.sort(origins, new Comparator<Origin>() {
            @Override
            public int compare(Origin o1, Origin o2) {

                // - : 자리바꿈을 하지 않음.
                // + : 자리바꿈을 한다.
                return (Integer.compare(o1.getAge(),o2.getAge()));
            }
        });

        for (var o: origins){
            System.out.println(o);
        }
    }
}


