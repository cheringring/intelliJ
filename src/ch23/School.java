package ch23;
import java.util.*;


//반
public class School {



    private String name;
    private Set<Student> students;
    private List<Subject> subjects;
    private static Long stuNumber = 1L; // 메모리에 그냥 박혀버림



    public School (String name){
        this.name = name;
        students = new HashSet<>();
        subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createStudent( String name){
        students.add(new Student(name,School.stuNumber++));
    }
    //학생이 학급에 등록이 된다.

    public Student findStudent(Long stuNumber){
        for(var student : students){
            if (Objects.equals(student.getStuNumber(),stuNumber))
            return student;
        }
        return null;
    }
    public void setSubjectStudent( Long stuNumber,Sub sub, int score){
       subjects.add(new Subject(stuNumber,sub,score));

    }





    }



