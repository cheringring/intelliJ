package ch10;


//Q1. 대구대학교는 학생이 입학할때마다 학번을 부여한다.
//        학번은 1식 증가된다고 가정
//        학생 2명만 대구대학교에
//        입학 등록 가능하다고 가정
//단 학생정보는 필수적으로 학번과 주소, 이름이 필요하다.
//입학한 학생들의 정보를 출력해볼수 있는 프로그램을 작성!
public class Student {

    String studentNum;
    String name;
    String address;

    static Student[] studentNumList = new Student[2];

    public void setName(String name){
        this.name = name;

    }
    public void setAddr(String address){
        this.address = address;

    }
    public void setStudentNum(String studentNum){
        this.studentNum=studentNum;

    }
    public void getStudentNum(Student studentNum){
        studentNumList[2]= studentNum;
    }
    public void studentInfo(){
        System.out.println("학번:"+studentNum+" , 이름: "+name+" , 주소"+address);

    }
}
