package ch09.stu;

// 두명의 학생의 정보를 교환하는 코드를 작성
public class Student {
    String name;
    int age;

    // 자신의 속성을 외부에서도 쓸 수 있게 셋팅한다.
    // 타 객체가 설정할 수 있도록 path를 열어준다. (메소드를 만든다!)
    public void setName(String name){
        this.name =name;

    }
    public void setAge(int age){
        this.age=age;
    }
    public void printInfo(){
        System.out.println("학생의 정보: " +name+" 학생의 나이: "+age);

    }
}

class AppUI{
    public static void main(String[] args) {
        var student1= new Student();
        student1.setName("kavin");
        student1.setAge(18);
        var student2 = new Student();
        student2.setName("david");
        student2.setAge(19);
        //학생객체 임의로 정의함. (사용자 화면단에서 받아온 정보라고 치자.)


        System.out.println("============before===========");
        student1.printInfo();
        student2.printInfo();

        System.out.println("=============after============");
        var ui = new AppUI();
        ui.swapStudent(student1,student2);
        student1.printInfo();
        student2.printInfo();

    }

    public void swapStudent(Student s1, Student s2){

        // 객체 전체를 받으면 안되고 예를들어
        // tmpStudent = s1 ; 이런식으로 받아서
        // tmpStudent.setAge(tmpStudent.age+10); 이런식으로
        // 받으면 안된다.


        String tmpName = s1.name;
        int tmpAge = s1.age;

        // 값을 실제 메모리에 접근해서 바꿈.
        s1.setName(s2.name);
        s1.setAge( s2.age);

        s2.setName(tmpName);
        s2.setAge(tmpAge);


        // 원본을 보존하고자 하고 내부적으로 객체를 쓴다면  ??
//        public void swapStudent(Student s1){
//
//
//            var tmpStudent = new Student();
//            tmpStudent.setName(s1.name);
//            tmpStudent.setAge(s1.age);
//
//            tmpStudent.setAge(tmpStudent.age + 10);
//        }

    }
}
