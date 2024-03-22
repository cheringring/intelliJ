package ch23;

import java.io.PrintStream;
import java.util.*;
public class SchoolUI {
    public static void main(String[] args) {

        SchoolMgr.getINSTANCE().createSchoolClass("a class");
        var findClass = SchoolMgr.getINSTANCE().findClass("a class");
        findClass.createStudent("민수");
        findClass.createStudent("영희");
        findClass.setSubjectStudent(22221717L,Sub.KOREA,90);



        System.out.println(findClass);

        }


    }

