package HandsOnTest;

public class Programmer {


    private Human human;
    private String company;

    public Programmer(Human human){
        this(human,"비회사소속");
    }

    public Programmer(Human human,String company){
        this.human=human;
        this.company=company;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void Cording(){
        System.out.println(getHuman().getName()+" 이(가) " + company +" 에서 코딩을 합니다.");
    }
}
