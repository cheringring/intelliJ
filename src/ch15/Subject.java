package ch15;

 class Subject { // 과목을 학생이 가질거임.

    Course course;

    int score;


     public Subject(Course course){
         this(course,0);
         //시험 안친 애들 0
     }

     public Subject(Course course, int score) {
         this.course = course;
         this.score = score;



     }

     @Override
     public String toString() {
         return "\n" +
                 "과목: " + course +", 과목코드: "+ course.getCode() +
                 ", 점수=" + score +
                 '\n';
     }
 }

