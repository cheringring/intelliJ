package ch17.EduInner;

public enum Course1 {
    KOREAN("AF9090"),
    MATH("MA9090"); // 생성자함수가 있기떄문에 세미콜론

    // 이넘도 클래스기 때문에 생성자 함수를 가질 수 있다.
    private String code;

    // private 함수
    Course1(String code) { // 오버로딩한 생성자 함수.
        this.code = code;

    }

    // 외부에서 쓸 수 있도록 통로를 열어줘야함.
    public String getCode() {
        return code;
    }
}