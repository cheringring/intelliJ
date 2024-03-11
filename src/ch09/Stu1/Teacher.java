package ch09.Stu1;

import ch09.stu.Student;

public class Teacher {
    String name;
    String major;
    Student student;

    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major){
        this.major= major;

    }

    public void askQuestion(Student student,String question){
        this.student=student;
        student.askQuestion(question);
    }

    public boolean checkAnswer(){
        String answer = student.getAnswer();
        return (answer != null && answer.equalsIgnoreCase("Seoul"));
    }
}
