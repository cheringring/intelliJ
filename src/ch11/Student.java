package ch11;

public class Student {

    String name;
    String addr;
    Long studentNum;


public void setName(String name){
    this.name = name;
}

    public void setStudentNum(Long studentNum){

        this.studentNum=studentNum;

    }
    public void printInfo(){
        System.out.println(name+":"+studentNum);
    }
        }


    class School{
    String name;

    // studentNum의 숫자를 할당.
    static Long studentNum = 24000000L;
    Student []  students = new Student[2];
    int studentIdx;

    public void setName(String name){
        this.name= name;

    }


    //public class Student 여서 다 받을 수 있다.
    public void register(Student student){
        if (studentIdx < students.length){
            student.setStudentNum(studentNum++);
            // setStudentNum에다가 studentNum ++ 된 값 집어넣음

            // student[1], student[2]
            students[studentIdx++]= student;
            //첫번째 인덱스는 24000000, 두번째는 2400001
        }
        else System.out.println("정원 초과입니다.");
    }

    public void printInfo(){

        for (var student: students){ //변수 student에 students배열을 할당.
            if (student != null) student.printInfo();

        }
    }
    }

    class UniApp{
        public static void main(String[] args) {
            var school = new School();
            school.setName("대구대학교");
            var student = new Student();
            student.setName("임창식");
            var otherStudent = new Student();
            otherStudent.setName("김덕배");

            school.register(student); // 학번
            school.register(otherStudent); // 학번
            school.printInfo();
        }
    }