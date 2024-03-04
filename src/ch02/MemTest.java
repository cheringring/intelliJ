package ch02;

public class MemTest {
    public static void main(String[] args) {
        int a= 5;
        int b= 10;

        Counter counter = new Counter();

    }

    public static void twice() {

    }
}

class Counter{
    int state = 50;
    int count =20;

    public int get(){
        return state+count;
    }

}
