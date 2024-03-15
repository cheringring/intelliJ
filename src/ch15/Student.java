package ch15;

import java.util.Arrays;

public class Student {

    // 자기가 수강한 과목이 있다.

    String name;
   Subject[] subjects= new Subject[2];
   int subjectIndex;


    public Student (String name){
        this.name=name;

    }
    public void addSubject(Subject subject){
        // 외부에서 입력받을 수 있도록
        subjects[subjectIndex++]=subject;

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
                ", 과목 인덱스=" + subjectIndex +
                '\n';
    }
}
