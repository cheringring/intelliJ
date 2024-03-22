package ch23;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SchoolMgr {

    private static SchoolMgr INSTANCE;
    private Set<School> classes;


    private SchoolMgr() {
        classes = new HashSet<>();
    }

    ;

    public static synchronized SchoolMgr getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SchoolMgr();
        }
        return INSTANCE;
    }




    public void createSchoolClass(String name) {
        classes.add(new School("a class"));
    }



    public School findClass(String name){
    for( var class_ : classes){
        if(Objects.equals(class_.getName(),name)) return class_;


    }
    return null;

    }
}



