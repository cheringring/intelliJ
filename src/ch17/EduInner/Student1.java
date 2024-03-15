package ch17.EduInner;

// Subject가  innerClass인 경우.

import java.util.Arrays;

public class Student1 {

    // 자기가 수강한 과목이 있다.

    static String name; // 내부 클래스 Subject에도 쓸려면 여기에도 static을 붙여야함.

    Subject1[] subjects = new Subject1[2];
    int subjectIndex;


    public Student1(String name) {
        this.name = name;

    }

    public void addSubject(Course1 course, int score) {
        // 외부에서 입력받을 수 있도록
        subjects[subjectIndex++] = new Subject1(course, 90);

    }

    public void addSubject(Course1 course) {
        // 외부에서 입력받을 수 있도록
        subjects[subjectIndex++] = new Subject1(course, 0);

    }

    public int sumScore() {
        var sum = 0;

        for (var s : subjects) {
            sum += s.score;
            // sum에다가 스코어를 구하기.
        }
        return sum;

    }

    @Override
    public String toString() {
        return "학생: " +
                "이름:" + name +
                " " + Arrays.toString(subjects) +
                ", 인덱스=" + subjectIndex +
                '\n';
    }

    private static class Subject1 { // 과목을 학생이 가질거임.

        Course1 course;

        int score;


        public Subject1(Course1 course) {
            this(course, 0);
            //시험 안친 애들 0
        }

        public Subject1(Course1 course, int score) {
            //static 클래스 여서 일반 인스턴스 변수 안됨. 쓸려면
            // 쓸 클래스도 static 해야됨.
            name = "Kim";
            this.course = course;
            this.score = score;


        }

        @Override
        public String toString() {
            return "\n" +
                    "과목: " + course + ", 과목코드: " + course.getCode() +
                    ", 점수=" + score +
                    '\n';
        }
    }
}
