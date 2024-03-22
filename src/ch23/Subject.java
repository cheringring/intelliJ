package ch23;

enum Sub {
    KOREA("KOR10"),
    MATH("MAT11");

    private String code;


    Sub(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

}



public class Subject {


    private Sub sub;
    private int score;
    private Long stuNumber;

    private static Subject INSTANCE;
    private Subject(){};

    public static synchronized Subject getINSTANCE() {
        if(INSTANCE ==null){
            INSTANCE= new Subject();
        }
        return INSTANCE;
    }

    public Subject (Long stuNumber,Sub sub){
        this(stuNumber,sub,0);

    }
    public Subject(Long stuNumber,Sub sub,int score){
        this.stuNumber= stuNumber;
        this.sub=sub;
        this.score=score;
    }

    public Sub getSub() {
        return sub;
    }

    public void setSub(Sub sub) {
        this.sub = sub;
    }

    public void getSub(Sub sub,int score){
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    public static void setINSTANCE(Subject INSTANCE) {
        Subject.INSTANCE = INSTANCE;
    }

}


