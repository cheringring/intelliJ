package ch09.Stu1;

public class Student {
    public String name;
    public int age;
    public String answer;

    public void setName(String name){
        this.name=name;

    }
    public void setAge(int age){
        this.age=age;

    }

    public void askQuestjon(String question){
        System.out.println("질문: "+question);
    }
    public void prepareAnswer(String answer){
        this.answer =answer;
    }
    public String getAnswer(){
        return answer;
    }

}
