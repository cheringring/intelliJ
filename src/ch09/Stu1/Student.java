package ch09.Stu1;

public class Student {
    String name;
    int age;
    String answer;

    public void setName(String name) {
        this.name = name;

    }

//    public void setAge(int age) {
//        this.age = age;
//
//    }

//    public void askQuestion(String question){
//        System.out.println("질문: "+question);
//    }

    public void askQuestion(String question){
        System.out.println("질문: "+question);
    }

    public void prepareAnswer(String answer){
        this.answer = answer;
    }
    public String getAnswer(){
        return answer;
    }
    }
