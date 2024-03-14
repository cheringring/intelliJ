package ch15;

 class Subject { // 과목을 학생이 가질거임.
    Course name;
    String code;
    int score;


     public Subject(Course name,String code){
         this(name,code,0);
         //시험 안친 애들 0
     }

    public Subject(Course name,String code,int score){
        this.name=name;
        this.code=code;
        this.score=score;

    }

     @Override
     public String toString() {
         return "Subject{" +
                 "name='" + name + '\'' +
                 ", code='" + code + '\'' +
                 ", score=" + score +
                 '}';
     }
 }

