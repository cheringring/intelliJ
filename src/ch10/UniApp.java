package ch10;

import ch10.Student;


class UniApp {
    Student studentO =new Student();
    Student studentT =new Student();

         public void setStudents(Student studentO,Student studentT){

            this.studentO=studentO;
            this.studentT=studentT;
            studentO.setName("홍길동");
            studentO.setAddr("경주시");
           // studentO.setStudentNum();


             studentT.setName("김민");
             studentT.setAddr("대구광역시");
            // studentT.setStudentNum();

        }

        public void printStudent(){

             System.out.println("입학자 명단: 이름: "+ studentO.name+", 주소 : "+studentO.address+", 학번: "+Student.studentNumList[0]+
                     "\n      이름: "+studentT.name+", 주소: "+studentT.address+", 학번: "+Student.studentNumList[1]);

        }



    }
