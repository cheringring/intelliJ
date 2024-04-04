package ch31;

public interface MyFuction {
    void print (String str);
}

class Main {
    public static void main(String[] args) {
        MyFuction myFuction = (str) -> System.out.println(str+"kkkk");
        //MyFuction myFuction = System.out::println;
        myFuction.print("hello");
    }
}
