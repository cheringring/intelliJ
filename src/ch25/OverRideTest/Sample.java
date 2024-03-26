package ch25.OverRideTest;

public class Sample {

    public void aaa(){
        System.out.println("Sample aaa");
    }
}


class Main_{
    public static void main(String[] args) {
        var sample1 = new Sample();
        var sample2 = new Sample();

        sample1.aaa();
        sample2.aaa();


        // 둘이 주소가 같을까 다를까?


    }
}