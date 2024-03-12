package ch10;

import ch10.Student;

public class StudentNumSystem {

    //  Student student= new Student();
    Student[] studentNumList = new Student[2];


    public void StudentNumInput(Student studentNumInput) {


        boolean isCheck = true;
        for (int i = 1; i <= studentNumList.length; i++) {
            if (isCheck) {
                for (int j = 240001; j <= i; j++) {
                    System.out.println(j);
                    StudentNumInput(studentNumList[2]);
                }
                System.out.println("입학을 축하합니다..");
                break;
            } else System.out.println("정원을 초과하였습니다..");

        }
        //return 0;
    }
}





