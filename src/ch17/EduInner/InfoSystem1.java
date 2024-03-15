package ch17.EduInner;


public class InfoSystem1 {

    public static void main(String[] args) {


        var koreanCourse= Course1.KOREAN;
        var mathCourse= Course1.MATH;

        var student = new Student1("kavin");
//        var korean= new Subject1(koreanCourse,30);
//        var math = new Subject1(mathCourse,10);

        student.addSubject(Course1.MATH,10);
        student.addSubject(Course1.KOREAN);
        System.out.println(student.sumScore());

        System.out.println();
        System.out.println(student);

    }
}
