package ch09.Stu1;

import ch09.stu.Student;

public class Main {
    public static void main(String[] args) {

        var studentOne = new Student();
        studentOne.setAge(10);
        studentOne.setName("kavin");

        var studentTwo = new Student();
        studentTwo.setAge(12);
        studentTwo.setName("david");


        var teacher = new Teacher();

        //teacher.askQuestion(studentTwo,"what is capital?");
        //studentTwo.prepareAnswer("seoul");


        // boolean isCorrect = teacher.checkAnswer();
//
//        if (isCorrect)
//            System.out.println("정답");
//        else
//            System.out.println("오답");
//    }
//}

    }
}