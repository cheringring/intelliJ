package ch23;

import java.time.format.SignStyle;
import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private Long stuNumber =1L;


    public Student(String name){
        this(name,null);
    }


    public Student (String name,Long stuNumber) {
        this.name = name;
        this.stuNumber=  stuNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    //학번 중복방지
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects.equals(stuNumber, that.stuNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNumber);
    }

}
