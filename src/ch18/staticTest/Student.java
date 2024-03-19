package ch18.staticTest;


public class Student{
    private Long count = 1L;

    public static Long myCount(){

        return new Student().count++;

    }
}



