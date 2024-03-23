package HandsOnTest;

public class Singer {

    private Human human;
    private String bandName;


    public Singer(Human human){
        this(human,"무소속");
    }
    public Singer(Human human,String bandName){
        this.human=human;
        this.bandName=bandName;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void Singing(){
        System.out.println(getHuman().getName()+" 이(가) "+bandName+" 에서 노래를 부릅니다.");

        }
    }

