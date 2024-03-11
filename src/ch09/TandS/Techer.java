package ch09.TandS;

public class Techer {
    String name;
    String major;

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void TQ(String tQ) {
        System.out.println("선생님:" + tQ);
    }

    public void StudentAnswer(String Sanswer) {
        System.out.println("학생: " + Sanswer);

    }


    public void TecherInfoPrint() {
        System.out.println("이름: " + name + ", 전공: " + major);

    }
}



class TSAppUI{
    public static void main(String[] args) {

        var techer= new Techer();

        techer.setName("james");
        techer.setMajor("국어");

        techer.TQ("취미가 뭐니?");
        techer.StudentAnswer("책읽기요.");

        techer.TecherInfoPrint();


    }
}



