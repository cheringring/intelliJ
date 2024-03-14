package ch15;

public class InfoSystem {

    public static void main(String[] args) {


        var student = new Student("kavin");
        var korean= new Subject(Course.KOREAN,Contants_.KOREAN_CODE,30);
        var math = new Subject(Course.MATH,Contants_.MATH,10);

        student.addSubject(korean);
        student.addSubject(math);
        System.out.println(student.sumScore());

        System.out.println();
        System.out.println(student.sumScore());

        }
    }
