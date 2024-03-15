package ch15;

public class InfoSystem {

    public static void main(String[] args) {


        var koreanCourse= Course.KOREAN;
        var mathCourse= Course.MATH;

        var student = new Student("kavin");
        var korean= new Subject(koreanCourse,30);
        var math = new Subject(mathCourse,10);

        student.addSubject(korean);
        student.addSubject(math);
        System.out.println(student.sumScore());

        System.out.println();
        System.out.println(student);

        }
    }
